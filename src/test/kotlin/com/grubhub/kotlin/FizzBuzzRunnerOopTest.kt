package com.grubhub.kotlin

import com.nhaarman.mockito_kotlin.inOrder
import com.nhaarman.mockito_kotlin.mock
import org.junit.Test
import java.io.PrintStream

class FizzBuzzRunnerOopTest {
    @Test
    fun fizzBuzz() {
        val printer = mock<PrintStream>()
        val instance = FizzBuzzRunnerOop(printer)

        instance.fizzBuzz(15)

        inOrder(printer) {
            verify(printer).println("1")
            verify(printer).println("2")
            verify(printer).println("FIZZ")
            verify(printer).println("4")
            verify(printer).println("BUZZ")
            verify(printer).println("FIZZ")
            verify(printer).println("7")
            verify(printer).println("8")
            verify(printer).println("FIZZ")
            verify(printer).println("BUZZ")
            verify(printer).println("11")
            verify(printer).println("FIZZ")
            verify(printer).println("13")
            verify(printer).println("14")
            verify(printer).println("FIZZBUZZ")
        }
    }
}
