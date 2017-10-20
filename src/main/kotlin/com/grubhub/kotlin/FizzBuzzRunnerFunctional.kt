package com.grubhub.kotlin


fun fizzBuzzFunctional(limit: Int) {
    printAll(calculateAllValues(limit))
}

fun printAll(values: Collection<String>) {
    values.map { System.out.println(it) }
}

fun calculateAllValues(limit: Int): Collection<String> {
    return (1..limit).map(::calculateValueForNumber)
}

fun fizzBuzzFunctionIsolated(limit: Int,
                             printAll: (Collection<String>) -> Unit = { printAllIsolated(it) },
                             calculateAll: (Int) -> Collection<String> = { calculateAllValuesIsolated(it) }) {
    printAll(calculateAll(limit))
}

fun calculateAllValuesIsolated(limit: Int,
                               calculate: (Int) -> String = ::calculateValueForNumber)
        : Collection<String> {
    return (1..limit).map(calculate::invoke)
}

fun printAllIsolated(values: Collection<String>,
                     printer: (String) -> Unit = System.out::println) {
    values.map(printer::invoke)
}
