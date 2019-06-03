package nl.seiferd.kotlin

sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
class Subtract(val left: Expr, val right: Expr) : Expr()
class Multiply(val left: Expr, val right: Expr) : Expr()
class Divide(val left: Expr, val right: Expr) : Expr()

fun main(args: Array<String>) {
    println(eval(
            Multiply(
                    Sum(Num(3), Num(4)),
                    Sum(Num(3), Num(4))
            )
    ))
}

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + (eval(e.right))
            is Subtract -> eval(e.left) - (eval(e.right))
            is Multiply -> eval(e.left) * (eval(e.right))
            is Divide -> eval(e.left) / (eval(e.right))
        }
