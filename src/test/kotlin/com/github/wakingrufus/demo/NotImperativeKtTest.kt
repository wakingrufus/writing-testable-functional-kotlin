package com.github.wakingrufus.demo

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import java.time.Instant


class NotImperativeKtTest {
    @Test
    fun `test fixChatMessagesImperative`() {
        assertArrayEquals(listOf("test", "a ****", "all caps").toTypedArray(),
                fixChatMessagesImperative(
                        listOf(
                                ChatMessage(message = "test", user = "any user", timestamp = Instant.now()),
                                ChatMessage(message = "a bad word", user = "any user", timestamp = Instant.now()),
                                ChatMessage(message = "wrong user", user = "SYSTEM", timestamp = Instant.now()),
                                ChatMessage(message = "ALL CAPS", user = "any user", timestamp = Instant.now())
                        )
                ).toTypedArray())
    }

    @Test
    fun `test fixChatMessagesNotImperative`() {
        assertArrayEquals(listOf("test", "a ****", "all caps").toTypedArray(),
                fixChatMessagesNotImperative(
                        listOf(
                                ChatMessage(message = "test", user = "any user", timestamp = Instant.now()),
                                ChatMessage(message = "a bad word", user = "any user", timestamp = Instant.now()),
                                ChatMessage(message = "wrong user", user = "SYSTEM", timestamp = Instant.now()),
                                ChatMessage(message = "ALL CAPS", user = "any user", timestamp = Instant.now())
                        )
                ).toTypedArray())
    }

}
