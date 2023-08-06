package basic

/**
 * 선메모리 탑재
 */
const val PI = 3.14 // static final

fun main(args: Array<String>) {
    val name = "deneb" // final
    var i = 0;

    println(getPI())
}

fun getPI(): Double = PI