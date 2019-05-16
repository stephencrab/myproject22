package com.tom

fun main(args: Array<String>) {
//    print("Hello Kotlin")
//    Human().hello();
    val h = Human()
    h.hello()
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}