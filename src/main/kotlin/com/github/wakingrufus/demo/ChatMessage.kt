package com.github.wakingrufus.demo

import java.time.Instant

data class ChatMessage(val user: String,
                       val timestamp: Instant,
                       val message: String)
