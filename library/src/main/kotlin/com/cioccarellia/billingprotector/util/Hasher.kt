package com.cioccarellia.billingprotector.util

import java.security.MessageDigest
import kotlin.experimental.and

object Hasher {
    private const val HASH_METHOD = "MD5"

    fun md5(input: String): String {
        val md = MessageDigest.getInstance(HASH_METHOD)
        md.update(input.toByteArray())

        val digest = md.digest()
        val buffer = StringBuffer()
        val magicByte = 0xff.toByte()

        for (b in digest) {
            buffer.append(String.format("%02x", b and magicByte))
        }

        return buffer.toString()
    }
}