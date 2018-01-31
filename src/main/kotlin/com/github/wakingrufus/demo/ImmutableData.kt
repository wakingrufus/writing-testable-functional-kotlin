package com.github.wakingrufus.demo

class ImmutableValue(val stringData: String)
data class ImmutableDataValue(val stringData: String)

fun function(){
    val data = ImmutableValue(stringData = "a")
    data.stringData
    val dataClass = ImmutableDataValue(stringData = "s")
    val dataClass2 = dataClass.copy(stringData = "a")
    dataClass2.stringData
}
