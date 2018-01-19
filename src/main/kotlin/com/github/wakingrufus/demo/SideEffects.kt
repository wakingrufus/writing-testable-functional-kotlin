package com.github.wakingrufus.demo

val externalMessages: ArrayList<ChatMessage> = ArrayList()

fun addNewMessageSideEffect(
        messages: ArrayList<ChatMessage>,
        newMessage: ChatMessage) {
    messages.add(newMessage)
}

fun addNewMessageSideEffect2(newMessage: ChatMessage) {
    externalMessages.add(newMessage)
}

fun addNewMessage(
        messages: List<ChatMessage>,
        newMessage: ChatMessage)
        : List<ChatMessage> {
    return messages.plus(newMessage)
}
