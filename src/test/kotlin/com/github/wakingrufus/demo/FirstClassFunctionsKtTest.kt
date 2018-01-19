package com.github.wakingrufus.demo

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.math.BigDecimal

class FirstClassFunctionsKtTest {
    @Test
    fun `test bigDecimalEquals`() {
        assertTrue(bigDecimalEquals(BigDecimal.ONE, BigDecimal("1")))
        assertFalse(bigDecimalEquals(BigDecimal.ONE, BigDecimal("1.01")))
    }

    @Test
    fun `test bigDecimalEquals2`() {
        assertTrue(bigDecimalEquals2(BigDecimal.ONE, BigDecimal("1")))
        assertFalse(bigDecimalEquals2(BigDecimal.ONE, BigDecimal("1.01")))
    }

    @Test
    fun `test BigDecimalEquals3`() {
        assertTrue(bigDecimalEquals3(BigDecimal.ONE, BigDecimal("1")))
        assertFalse(bigDecimalEquals3(BigDecimal.ONE, BigDecimal("1.01")))
    }
}
