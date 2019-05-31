package nl.seiferd.kotlin

fun main(args: Array<String>){
    collections()

    println("Additionally".lastChar())
    println("Additionally".lastChar)
}

fun collections () {
    val set = hashSetOf(1, 7, 53, 7)
    val list = arrayListOf(1, 7, 53, 7)
    val listOfString = arrayListOf("Piet", "je", "puk")
    val map = hashMapOf(
            1 to "one",
            7 to "seven",
            53 to "fifty-three"
    )

    println("Last element is ${set.last()}")
    println("Max value is ${list.max()}")
    println("The set is $set")
    println(map)
    println(list.joinToString())
    println(listOfString.join())
}
