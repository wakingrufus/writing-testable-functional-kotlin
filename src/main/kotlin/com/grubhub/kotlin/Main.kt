package com.grubhub.kotlin

fun main(args: Array<String>) {
    System.out.println("OOP: ")
    val runner = FizzBuzzRunnerOop(System.out)
    runner.fizzBuzz(limit = 15)

    System.out.println("Functional: ")
    fizzBuzzFunctional(limit = 15)

    System.out.println("Functional (isolated): ")
    fizzBuzzFunctionIsolated(limit = 15)
}
