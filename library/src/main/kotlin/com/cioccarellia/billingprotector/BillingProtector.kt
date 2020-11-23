/**
 * Designed and developed by Andrea Cioccarelli (@cioccarellia)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cioccarellia.billingprotector

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import com.cioccarellia.billingprotector.engine.PirateAppsGenerator
import com.cioccarellia.billingprotector.model.PackageScanStrategy
import com.cioccarellia.billingprotector.model.PirateApp
import com.cioccarellia.billingprotector.model.ScanResult
import com.cioccarellia.billingprotector.model.ScanStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BillingProtector(
    private val context: Context
) {
    private val pirateApps = PirateAppsGenerator.buildList()

    @SuppressLint("QueryPermissionsNeeded")
    suspend fun scan(): ScanResult = withContext(Dispatchers.Default) {
        val installedApps = context.packageManager.getInstalledApplications(PackageManager.GET_META_DATA)
        val jail = mutableListOf<PirateApp>()

        for (installedApp in installedApps) {
            pirateApps.forEach { pirate ->
                when (pirate.strategy) {
                    PackageScanStrategy.CONTAINS -> {
                        if (installedApp.packageName.contains(pirate.packageName))
                            jail.add(pirate)
                    }

                    PackageScanStrategy.MATCH -> {
                        if (pirate.packageName == installedApp.packageName)
                            jail.add(pirate)
                    }

                    PackageScanStrategy.CLASS_NAME -> {
                        installedApp.className?.let {
                            if (installedApp.className.contains(pirate.packageName)) {
                                jail.add(pirate)
                            }
                        }
                    }

                    PackageScanStrategy.REGEXP -> {
                        val nonLocalizedLabel = installedApp.nonLocalizedLabel
                        val regexp = pirate.packageName.toRegex()

                        if (nonLocalizedLabel != null) {
                            if (nonLocalizedLabel.matches(regexp))
                                jail.add(pirate)
                        } else {
                            if (installedApp.loadLabel(context.packageManager).matches(regexp))
                                jail.add(pirate)
                        }
                    }
                }
            }
        }

        return@withContext if (jail.isEmpty()) clear() else pirate(jail)
    }

    private fun clear() = ScanResult(ScanStatus.CLEAR, emptyList())
    private fun pirate(list: List<PirateApp>) = ScanResult(ScanStatus.DANGEROUS_APPS_DETECTED, list)
}