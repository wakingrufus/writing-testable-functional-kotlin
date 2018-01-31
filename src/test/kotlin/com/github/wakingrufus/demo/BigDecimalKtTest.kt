package com.github.wakingrufus.demo

import org.junit.Test
import java.math.BigDecimal

import kotlin.test.assertTrue

class BigDecimalKtTest {
    @Test
    fun pow() {
        2 `to the` 3 equals 8
        10 `to the` 3 equals 1000
        10 `to the` 1.5 equals BigDecimal("31.622776601683795227870632515987381339073181152343750")
        5 `to the` 0 equals 1
        5 `to the` 1 equals 5
        10 `to the` -2 equals BigDecimal("0.01")
        10 `to the` -1 equals BigDecimal("0.1")
    }

    infix fun Int.`to the`(exp: Int): BigDecimal = this.toBigDecimal().pow(exp.toBigDecimal())

    infix fun Int.`to the`(exp: Double): BigDecimal = this.toBigDecimal().pow(exp.toBigDecimal())

    infix fun Number.equals(result: Int) {
        assertTrue(actual = BigDecimal(this.toString()).compareTo(result.toBigDecimal()) == 0, message = "expected ${this} but was $result")
    }

    infix fun Number.equals(expected: BigDecimal) {
        assertTrue(actual = BigDecimal(this.toString()).compareTo(expected) == 0, message = "expected $expected but was $this")
    }

    fun Number.toBigDecimal(): BigDecimal {
        return BigDecimal(this.toString())
    }
}
