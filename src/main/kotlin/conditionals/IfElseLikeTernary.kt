package conditionals

fun main() {
    val n1 = 1_000
    val n2 = 1_000

    // 삼항연산자 ? 대신 더 깔끔하게 써진다.
    val msg =
        if (n1 > n2)  "n1 is bigger than n2"
        else if(n1 == n2) "same"
        else "n2 is bigger than n1"

    println(msg)

}