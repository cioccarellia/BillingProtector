package com.cioccarellia.billingprotector.model

import com.cioccarellia.billingprotector.util.Hasher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

data class PirateApp(
    val packageName: String,
    val hash: String,
    val name: String,
    val strategy: PackageScanStrategy
) {
    init {
        CoroutineScope(Dispatchers.Default).launch {
            val preloadedHash = hash
            val packageHash = Hasher.md5(packageName)

            check(packageHash == preloadedHash) {
                "Package corruption detected: [$packageName]'s preloaded hash is [$preloadedHash], but on-the-spot check returned [$packageHash]"
            }
        }
    }
}