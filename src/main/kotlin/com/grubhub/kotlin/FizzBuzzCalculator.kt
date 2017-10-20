package com.grubhub.kotlin

fun calculateValueForNumber(number: Int): String {
    val sb = StringBuilder()
    if (number % 3 == 0) {
        sb.append("FIZZ")
    }
    if (number % 5 == 0) {
        sb.append("BUZZ")
    }
    if (sb.isEmpty()) {
        sb.append(number)
    }
    return sb.toString()
}
