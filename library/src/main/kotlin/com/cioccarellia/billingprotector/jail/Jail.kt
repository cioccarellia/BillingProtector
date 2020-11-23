package com.cioccarellia.billingprotector.jail

object Jail {
    private const val lucky_patcher = "Lucky Patcher"
    private const val freedom = "Freedom"
    private const val xmodgames = "XModGames"
    private const val uret_patcher = "Uret Patcher"
    private const val creeplays_patcher = "Creeplays Patcher"
    private const val creehack = "Creehack"
    private const val playcards = "Leo Playcards"
    private const val appsara = "AppSara"
    private const val modded_store = "Modded Google Play Store"


    object match {
        /**
         * Lucky Patcher
         */
        const val package1 = "com.chelpus.lackypatch"
        const val hash1 = "419cb6875f3fa235ed925c28afc44f2e"
        const val name1 = lucky_patcher

        const val package2 = "com.dimonvideo.luckypatcher"
        const val hash2 = "cd9de8549c3e6e151300734f112091b3"
        const val name2 = lucky_patcher

        const val package3 = "com.forpda.lp"
        const val hash3 = "c2f5ef59294b96727c061ecc0a792392"
        const val name3 = lucky_patcher

        const val package4 = "com.android.vending.licensing.ILicensingService"
        const val hash4 = "238b2cc715459f7b9458e0e0744b15e2"
        const val name4 = lucky_patcher

        /**
         * Uret patcher
         * */
        const val package6 = "uret.jasi2169.patcher"
        const val hash6 = "7a3a1cdb08b74117b3c20f2e04ba099e"
        const val name6 = uret_patcher

        /**
         * Creeplays Patcher
         * */
        const val package7 = "org.creeplays.hack"
        const val hash7 = "b30bec898f00f528e382b95856ebb909"
        const val name7 = creeplays_patcher

        /**
         * CreeHack
         * */
        const val package8 = "apps.zhasik007.hack"
        const val hash8 = "48e3b21aec993834ca0a91f48a7099c6"
        const val name8 = creehack

        /**
         * Leo Playcards
         * */
        const val package9 = "com.leo.playcard"
        const val hash9 = "9d8a3405cd058e411c224fb680fa103c"
        const val name9 = playcards

        /**
         * AppSara
         * */
        const val package10 = "com.appsara.app"
        const val hash10 = "a00e921d238bb1b84d104e293313d225"
        const val name10 = appsara
    }


    object contains {
        /**
         * Lucky Patcher
         */
        const val package1 = "com.android.vending.billing.InAppBillingService."
        const val hash1 = "48b19168f8f466638c400c2e8eb8eebe"
        const val name1 = lucky_patcher

        const val package2 = "com.android.vending.billing.InAppBillingService."
        const val hash2 = "48b19168f8f466638c400c2e8eb8eebe"
        const val name2 = lucky_patcher

        /**
         * Freedom
         * */
        const val package3 = "jase.freedom"
        const val hash3 = "fde5230b767d93fbc23010f9de757f04"
        const val name3 = freedom

        const val package4 = "madkite.freedom"
        const val hash4 = "771df92f8cc82ad893bb3378a155338d"
        const val name4 = freedom

        /**
         * Modded Play Store
         * */
        const val package5 = "com.android.vendinc"
        const val hash5 = "81907933708408ddc91af1f381e65bff"
        const val name5 = modded_store

        /**
         * XModGames
         * */
        const val package6 = "com.xmodgame"
        const val hash6 = "00d0c2bf72590fd9281bb0d60a408092"
        const val name6 = xmodgames
    }

    object classname {
        /**
         * Lucky Patcher
         * */
        const val package1 = "com.lp"
        const val hash1 = "38d21e850edd2a6c6253918770a59b27"
        const val name1 = lucky_patcher
    }

    object regexp {
        /**
         * Lucky Patcher
         * */
        private const val l = "LІＬLлЛ"
        private const val u = "uцџｕu"
        private const val c = "cсçｃc"
        private const val k = "kкќӄｋk"
        private const val y = "yуӳӱӰӯӮУўｙy"
        private const val space = """+\-*\/.#@__\`"${'$'} ~    　\-°"""
        private const val p = "PРҎҏрＰｐP"
        private const val a = "aаӑӓａ"
        private const val t = "tтｔt"
        private const val h = "hнһӈҺｈÐ"
        private const val e = "eєёеҽзэҿｅµ"
        private const val r = "rяｒµ"
        private const val s = "sѕꜱ"

        const val package1 = """-*[$l][$u][$c][$k][$y][$space][$p][$a][$t][$c][$h][$e][$r][$s]?-*"""
        const val hash1 = "a1d88466ae656e9076a53ebe4dc3aceb"
        const val name1 = lucky_patcher

        /**
         * Lucky Patcher Installer
         * */
        const val package2 = """ru\..?.?[a]{3,}.?.?.?.?.?\.installer"""
        const val hash2 = "bbf8435e91dd3c17b741c2aa4b15d763"
        const val name2 = lucky_patcher
    }
}