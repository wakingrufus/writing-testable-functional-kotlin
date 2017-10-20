package com.grubhub.kotlin;

import java.io.PrintStream

class FizzBuzzRunnerOop(val linePrinter: PrintStream) {
    fun fizzBuzz(limit: Int) {
        for (i in 1..limit) {
            linePrinter.println(calculateValueForNumber(i))
        }
    }

    private fun calculateValueForNumber(number: Int): String {
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
}
