package com.grubhub.kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzCalculatorKtTest {
    @Test
    fun calculateValueForNumber() {
        assertEquals("1", calculateValueForNumber(1))
        assertEquals("FIZZ", calculateValueForNumber(3))
        assertEquals("BUZZ", calculateValueForNumber(5))
        assertEquals("FIZZBUZZ", calculateValueForNumber(15))
    }
}
