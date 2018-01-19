package com.github.wakingrufus.demo;

import org.junit.Test;

import java.math.BigDecimal;

import static com.github.wakingrufus.demo.NoFirstClassFunctions.bigDecimalEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NoFirstClassFunctionsTest {
    @Test
    public void testBigDecimalEquals() throws Exception {
        assertTrue(bigDecimalEquals(BigDecimal.ONE, new BigDecimal("1")));
        assertFalse(bigDecimalEquals(BigDecimal.ONE, new BigDecimal("1.01")));
    }
}
