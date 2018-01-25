package com.github.wakingrufus.demo

import org.junit.Assert.assertEquals
import org.junit.Test


class StandardFunctionsKtTest {
    @Test
    fun `test buildString`() {
        assertEquals("string 1", buildString())
        assertEquals("string 1param", buildString(param = "param"))
        assertEquals("string 1paramfirstsecond", buildString(param = "param", params = Pair("first", "second")))
    }

    @Test
    fun `test buildStringFunc`() {
        assertEquals("string 1", buildStringFunc())
        assertEquals("string 1param", buildStringFunc(param = "param"))
        assertEquals("string 1paramfirstsecond", buildStringFunc(param = "param", params = Pair("first", "second")))
    }

}
