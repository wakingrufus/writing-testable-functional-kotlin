package com.github.wakingrufus.demo

import java.io.PrintStream


fun printHelloWorld() {
    System.out.println("Hello World")
}

fun printHelloWorld2(printStream: PrintStream) {
    printStream.println("Hello World")
}

fun printHelloWorld3(printer: (String) -> Unit) {
    printer("Hello World")
}

fun printHelloWorld4(printer: (String) -> Unit = System.out::println) {
    printer("Hello World")
}

fun buildPrinterFromPrintStream(printStream: PrintStream): (String) -> Unit {
    return printStream::println
}
