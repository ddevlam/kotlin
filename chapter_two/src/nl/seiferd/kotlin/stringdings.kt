package nl.seiferd.kotlin

import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(sep: String = ";", pref: String = "(", post: String = ")"): String {
    val result = StringBuilder(pref)

    for ((index, element) in withIndex()) {
        if (index > 0) result.append(sep)
        result.append(element)
    }

    result.append(post)
    return result.toString()
}

fun Collection<String>.join() = joinToString(sep = "-")

fun String.lastChar() : Char = get(length -1)
val String.lastChar : Char get() = lastChar()