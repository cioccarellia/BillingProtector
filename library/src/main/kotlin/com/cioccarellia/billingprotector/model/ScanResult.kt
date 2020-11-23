package com.cioccarellia.billingprotector.model

data class ScanResult(
    val scanStatus: ScanStatus,
    val pirateList: List<PirateApp>
)