package com.github.wakingrufus.demo

fun buildString(param: String? = null, params: Pair<String, String>? = null): String {
    val sb = StringBuilder().append("string 1")
    if (param != null) {
        sb.append(param)
    }
    if (params != null) {
        sb.append(params.first).append(params.second)
    }
    val finalString = sb.toString()
    System.out.println(finalString)
    return finalString
}

fun buildStringFunc(param: String? = null, params: Pair<String, String>? = null): String =
        StringBuilder()
                .apply {
                    append("string 1")
                            .also {
                                param?.let {
                                    append(it)
                                }
                            }
                            .also {
                                params?.let {
                                    with(it) {
                                        append(first).append(second)
                                    }
                                }
                            }
                }
                .run {
                    toString()
                }
                .also {
                    System.out.println(it)
                }
