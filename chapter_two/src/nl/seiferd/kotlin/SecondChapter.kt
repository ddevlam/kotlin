package nl.seiferd.kotlin

import java.util.*

fun main(args: Array<String>) {
    println("Hello World")
    println("Max is " + max(2, 3))
    println("Max is ${max(4, 3)}")
    println(stringArgs("SeiferD"))

    for (nr in 1..100) println(fizzBuzz(nr))
    for((key, value) in createMap()){
        println("The key is $key and the value is $value")
    }

    println("${funWithIn('z')}")
}

fun max(x: Int, y: Int) = if (x > y) x else y

fun stringArgs(tval: String) = "Hello $tval"

fun fizzBuzz(nr: Int) =
        when {
            nr % 15 == 0 -> "FizzBuzz"
            nr % 5 == 0 -> "Buzz"
            nr % 3 == 0 -> "Fizz"
            else -> "$nr"
        }

fun createMap() :TreeMap<Char, String> {
    val map = TreeMap<Char, String>()
    val rand = Random()
    for(char in 'a'..'f'){
        map[char] = "${rand.nextInt()}"
    }

    return map
}

fun funWithIn(c: Char): String{
    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c: Char) = c !in '0'..'9'

    return when {
        isLetter(c) -> "$c is a letter"
        isNotDigit(c) -> "$c is not a digit"
        else -> "I don't know"
    }
}