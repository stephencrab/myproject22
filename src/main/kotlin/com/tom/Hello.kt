package com.tom

fun main(args: Array<String>) {
//    print("Hello Kotlin")
//    Human().hello();
    val h = Human()
    h.hello()
    var age = 19
    age = 20
    var weight = 66.5f
    var name:String
    name = "Hank"
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}