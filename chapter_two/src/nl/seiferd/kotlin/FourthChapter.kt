package nl.seiferd.kotlin

fun main(args: Array<String>) {
    val b = Button()
    b.showOff()
    b.click()
    b.setFocus(true)

    println(Client("SeiferD", 12345))

    val immutable = Client("Immutable", 54321)
    val copy = immutable.copy(postalCode = 12345)

    println(immutable)
    println(copy)

    val decorated = DecoratedClickable(Button())
    decorated.showOff()
    decorated.click()
}

class Button : Clickable, Focusable {
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    override fun click() = println("Clicked a button")
}

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
    fun showOff() = println("I'm focusable")
}

data class Client(val name: String, val postalCode: Int)

class DecoratedClickable(inner: Clickable) : Clickable by inner {
    override fun showOff() {
        print("Getting decorated \t")
        super.showOff()
    }
}