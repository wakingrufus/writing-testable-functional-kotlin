package com.github.wakingrufus.demo

import java.time.Instant

fun newMessageNonDeterministic(message: String): ChatMessage {
    return ChatMessage(
            user = System.getProperty("user.name"),
            timestamp = Instant.now(),
            message = message)
}

fun newMessageDeterministic(user: String, timestamp: Instant, message: String): ChatMessage {
    return ChatMessage(
            user = user,
            timestamp = timestamp,
            message = message)
}
