package conditionals

fun main() {
    val n1 = 100
    val n2 = 50

    // if else 를 when으로 표현
    when {
        (n1 >= n2) -> "n1 >= n2"
        (n1 == n2) -> "n1 == n2"
        (n1 <= n2) -> "n1 <= n2"
        else -> "ERROR"
    }

    val age = 18

    when (age) {
        // 범위 지정, in 조건도 된다!
        in 13..19 -> println("teen")
        !in 0..12 -> println("not a kid")

    }
}