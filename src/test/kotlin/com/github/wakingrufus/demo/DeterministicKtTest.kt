package com.github.wakingrufus.demo


import org.junit.Test
import java.time.Instant
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class DeterministicKtTest {
    @Test
    fun `test newMessageNonDeterministic`() {
        val firstCall = newMessageNonDeterministic("message")
        Thread.sleep(10L)
        assertNotEquals(firstCall, newMessageNonDeterministic("message"))
    }

    @Test
    fun newMessageDeterministic() {
        val time = Instant.now()
        val user = System.getProperty("user.name")
        val firstCall = newMessageDeterministic( user, time,"message")
        Thread.sleep(10L)
        assertEquals(firstCall, newMessageDeterministic( user, time,"message"))
    }
}
