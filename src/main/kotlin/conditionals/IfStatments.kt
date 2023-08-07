package conditionals

/**
 * if 문, 똑같다.
 */
fun main() {
    val n1 = 1_000
    val n2 = 1_000

    if (n1 > n2) {
        println("n1 is bigger than n2")
    } else if(n1 == n2) {
        println("same")
    } else {
        println("n2 is bigger than n1")
    }
}