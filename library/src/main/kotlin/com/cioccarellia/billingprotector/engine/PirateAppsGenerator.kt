package com.cioccarellia.billingprotector.engine

import com.cioccarellia.billingprotector.jail.Jail
import com.cioccarellia.billingprotector.model.PackageScanStrategy
import com.cioccarellia.billingprotector.model.PirateApp

internal object PirateAppsGenerator {
    fun buildList(): List<PirateApp> = listOf(
        PirateApp(Jail.contains.package1, Jail.contains.hash1, Jail.contains.name1, PackageScanStrategy.CONTAINS),
        PirateApp(Jail.contains.package2, Jail.contains.hash2, Jail.contains.name2, PackageScanStrategy.CONTAINS),
        PirateApp(Jail.contains.package3, Jail.contains.hash3, Jail.contains.name3, PackageScanStrategy.CONTAINS),
        PirateApp(Jail.contains.package4, Jail.contains.hash4, Jail.contains.name4, PackageScanStrategy.CONTAINS),
        PirateApp(Jail.contains.package5, Jail.contains.hash5, Jail.contains.name5, PackageScanStrategy.CONTAINS),
        PirateApp(Jail.contains.package6, Jail.contains.hash6, Jail.contains.name6, PackageScanStrategy.CONTAINS),

        PirateApp(Jail.classname.package1, Jail.classname.hash1, Jail.classname.name1, PackageScanStrategy.CLASS_NAME),

        PirateApp(Jail.match.package2, Jail.match.hash2, Jail.match.name2, PackageScanStrategy.MATCH),
        PirateApp(Jail.match.package3, Jail.match.hash3, Jail.match.name3, PackageScanStrategy.MATCH),
        PirateApp(Jail.match.package4, Jail.match.hash4, Jail.match.name4, PackageScanStrategy.MATCH),

        PirateApp(Jail.regexp.package1, Jail.regexp.hash1, Jail.regexp.name1, PackageScanStrategy.REGEXP),
        PirateApp(Jail.regexp.package2, Jail.regexp.hash2, Jail.regexp.name2, PackageScanStrategy.REGEXP)
    )
}