package conditionals

/**
 * if 표현식
 * 별도의 키워드가 없으면 값을 반환한다.
 */
fun main() {

    val n1 = 1_000
    val n2 = 1_000

    val msg = if (n1 > n2) {
        "n1 is bigger than n2"
    } else if(n1 == n2) {
        "same"
    } else {
        "n2 is bigger than n1"
    }

    println(msg)
}