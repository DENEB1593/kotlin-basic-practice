package loops

/**
 * index 값을 가져오는 방법
 * 역순으로 가져오는 방법은 깔끔하다.
 */
fun main() {
    val letters = charArrayOf('A', 'B', 'C', 'D')

    for (i in letters.indices) {
        println("$i - ${letters[i]}")
    }

    println("=================")

    /**
     * 역순
     */
    for (i in letters.indices.reversed()) {
        println("$i - ${letters[i]}")
    }

}