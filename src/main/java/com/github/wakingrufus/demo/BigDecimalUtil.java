package com.github.wakingrufus.demo;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalUtil {

    public static BigDecimal pow(BigDecimal base, BigDecimal exponent) {
        int signOf2 = exponent.signum();

        // Perform X^(A+B)=X^A*X^B (B = remainder)
        double dn1 = base.doubleValue();
        // Compare the same row of digits according to context
        BigDecimal n2 = exponent.multiply(new BigDecimal(signOf2)); // n2 is now positive
        BigDecimal remainderOf2 = n2.remainder(BigDecimal.ONE);
        BigDecimal n2IntPart = n2.subtract(remainderOf2);
        // Calculate big part of the power using context -
        // bigger range and performance but lower accuracy
        BigDecimal intPow = base.pow(n2IntPart.intValueExact());
        BigDecimal doublePow = new BigDecimal(Math.pow(dn1, remainderOf2.doubleValue()));
        BigDecimal result = intPow.multiply(doublePow);

        // Fix negative power
        if (signOf2 == -1)
            result = BigDecimal.ONE.divide(result, MathContext.DECIMAL64);
        return result;
    }
}
