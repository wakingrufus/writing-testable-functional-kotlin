package com.github.wakingrufus.demo

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test
import java.io.PrintStream
import kotlin.test.assertEquals


class HigherOrderKtTest {
    @Test
    fun `test printHelloWorld`() {
        printHelloWorld() // ???
    }

    @Test
    fun `test printHelloWorld2`() {
        val printStreamMock = mock<PrintStream>()
        printHelloWorld2(printStreamMock)
        verify(printStreamMock).println("Hello World")
    }

    @Test
    fun `test printHelloWorld3`() {
        var printedValue: String? = null
        printHelloWorld3({ s: String -> printedValue = s })
        assertEquals("Hello World", printedValue)
        // Prod call
        printHelloWorld3(System.out::println)
    }

    @Test
    fun `test printHelloWorld4`() {
        var printedValue: String? = null
        printHelloWorld4({ s: String -> printedValue = s })
        assertEquals("Hello World", printedValue)
        // Prod call
        printHelloWorld4()
        printHelloWorld4(buildPrinterFromPrintStream(System.out))
    }
}
