package com.grubhub.kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzRunnerFunctionalKtTest {
    @Test
    fun calculateAllValuesTest() {
        assertEquals(listOf("1", "2", "FIZZ", "4", "BUZZ", "FIZZ"),
                calculateAllValues(6))
    }

    @Test
    fun fizzBuzzFunctionalTest() {
        fizzBuzzFunctional(5)
        // no way to check what was printed, nor what was called
    }

    @Test
    fun printAllTest() {
        printAll(listOf("1", "a", "b"))
        // no way to check what was printed
    }


    @Test
    fun calculateAllValuesIsolatedTest() {
        // can now be tested in isolation from calculation logic
        assertEquals(listOf("c1", "c2", "c3", "c4", "c5", "c6"),
                calculateAllValuesIsolated(limit = 6, calculate = { "c" + it }))
    }

    @Test
    fun fizzBuzzFunctionIsolatedTest() {
        fizzBuzzFunctionIsolated(limit = 5,
                printAll = { assertEquals(listOf("1", "2", "FIZZ", "BUZZ", "BUZZ"), it) },
                calculateAll = {
                    if (it == 5) listOf("1", "2", "FIZZ", "BUZZ", "BUZZ") else listOf()
                })
    }

    @Test
    fun printAllIsolatedTest() {
        var printedValues = listOf<String>()
        printAllIsolated(listOf("1", "a", "b"), printer = { printedValues += it })
        assertEquals(listOf("1", "a", "b"), printedValues)
    }

    @Test
    fun fizzBuzzFunctionIntegrationTest() {
        fizzBuzzFunctionIsolated(limit = 5,
                printAll = {
                    assertEquals(listOf("1", "2", "FIZZ", "4", "BUZZ"), it)
                })
    }
}
