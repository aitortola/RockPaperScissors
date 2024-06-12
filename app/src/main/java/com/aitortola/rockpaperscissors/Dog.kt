package com.aitortola.rockpaperscissors

class Dog constructor(val name: String, val breed: String, var age: Int = 0)  {

    init {
        bark(name, breed)
    }

    fun bark(name : String, breed : String) {
        println("$name woof! woof!")
    }
}