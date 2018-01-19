package com.github.wakingrufus.demo;

import java.math.BigDecimal;

public class NoFirstClassFunctions {
    public NoFirstClassFunctions() {
        throw new UnsupportedOperationException();
    }

    public static boolean bigDecimalEquals(
            BigDecimal one,
            BigDecimal two) {
        return one.compareTo(two) == 0;
    }
}
