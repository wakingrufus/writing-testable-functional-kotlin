package com.github.wakingrufus.demo

import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.Instant

class SideEffectsKtTest {

    @Test
    fun `test addNewMessageSideEffect`() {
        val messages: ArrayList<ChatMessage> = ArrayList()
        addNewMessageSideEffect(messages, newMessageDeterministic("user", Instant.now(), "message"))
        assertEquals("oh no! our inputs have been modified", 1, messages.size)
    }

    @Test
    fun `test addNewMessageSideEffect 2`() {
        addNewMessageSideEffect2(newMessageDeterministic("user", Instant.now(), "message"))
        assertEquals("oh no! an external entity has been modified", 1, externalMessages.size)
    }


    @Test
    fun `test addNewMessage`() {
        val messages: ArrayList<ChatMessage> = ArrayList()
        val result = addNewMessage(messages, newMessageDeterministic("user", Instant.now(), "message"))
        assertEquals("our inputs have not been modified", 0, messages.size)
        assertEquals(1, result.size)
    }

}
