package collections

/**
 * List의 접근, 자바에서는 없는 기능이다.
 */
fun main() {
    val names = listOf("lee", "kim", "park", "choi")

    val (lee, kim, park, choi) = names

    println("$lee, $kim, $park, $choi")
}