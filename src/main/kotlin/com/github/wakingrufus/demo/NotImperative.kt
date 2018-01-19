package com.github.wakingrufus.demo

fun fixChatMessagesImperative(messages: List<ChatMessage>): List<String> {
    val fixedMessages: ArrayList<String> = ArrayList()
    for (m in messages) {
        var fixedMessage: String? = m.message
        if (m.message.contains("bad word")) {
            fixedMessage = m.message.replace("bad word", "****")
        }
        if (m.user == "SYSTEM") {
            fixedMessage = null
        }
        if (fixedMessage != null) {
            fixedMessage = fixedMessage.toLowerCase()
        }
        if (fixedMessage != null) {
            fixedMessages.add(fixedMessage)
        }
    }
    return fixedMessages
}


fun fixChatMessagesNotImperative(messages: List<ChatMessage>): List<String> =
        messages.filter { it.user != "SYSTEM" }
                .map { it.message.replace("bad word", "****") }
                .map(String::toLowerCase)

