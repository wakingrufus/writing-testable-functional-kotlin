package com.github.wakingrufus.demo;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class BigDecimalUtilTest {
    @Test
    public void pow() throws Exception {
        assertTrue(new BigDecimal(8)
                .compareTo(BigDecimalUtil.pow(new BigDecimal(2), new BigDecimal(3))) == 0);
        assertTrue(new BigDecimal(1000)
                .compareTo(BigDecimalUtil.pow(BigDecimal.TEN, new BigDecimal(3))) == 0);
        assertTrue(new BigDecimal("31.622776601683795227870632515987381339073181152343750")
                .compareTo(BigDecimalUtil.pow(BigDecimal.TEN, new BigDecimal(1.5))) == 0);
        assertTrue(BigDecimal.ONE
                .compareTo(BigDecimalUtil.pow(new BigDecimal(5), BigDecimal.ZERO)) == 0);
        assertTrue(new BigDecimal(5)
                .compareTo(BigDecimalUtil.pow(new BigDecimal(5), BigDecimal.ONE)) == 0);
        assertTrue(new BigDecimal("0.01")
                .compareTo(BigDecimalUtil.pow(BigDecimal.TEN, new BigDecimal(-2))) == 0);
        assertTrue(new BigDecimal("0.1")
                .compareTo(BigDecimalUtil.pow(BigDecimal.TEN, new BigDecimal(-1))) == 0);
    }

}