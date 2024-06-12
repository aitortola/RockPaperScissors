package com.aitortola.rockpaperscissors

fun main() {

    var daisy = Dog("Daisy", "Dwarf poodle", 9)
    println(
        "${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old"
    )
    daisy.age = 10

    println(daisy.age)


    var computerChoice = ""
    var playerChoice = ""
    while (playerChoice != "exit") {
        println("Rock, Paper or Scissors?, Enter your choice!!, or type 'exit' to quit")
        playerChoice = readln()

        val randomNumber = (1..3).random()
        when (randomNumber) {
            1 -> {
                computerChoice = "Rock"
            }

            2 -> {
                computerChoice = "Paper"
            }

            3 -> {
                computerChoice = "Scissors"
            }
        }
        println("Computer Choice: $computerChoice")

        val winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }

        if (winner == "Tie") {
            println("It's a tie!")
        } else {
            println("Winner: $winner!!")
        }
    }
}