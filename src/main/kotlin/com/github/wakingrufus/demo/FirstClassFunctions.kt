package com.github.wakingrufus.demo

import java.math.BigDecimal

fun bigDecimalEquals(one: BigDecimal, two: BigDecimal): Boolean {
    return one.compareTo(two) == 0
}

fun bigDecimalEquals2(one: BigDecimal, two: BigDecimal): Boolean =
        (one.compareTo(two) == 0)

val bigDecimalEquals3: (one: BigDecimal, two: BigDecimal) -> Boolean = { one, two ->
    one.compareTo(two) == 0
}
