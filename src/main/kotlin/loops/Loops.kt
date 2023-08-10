package loops

/**
 * 코틀린의 순환방법을 알아 본다.
 */
fun main() {
    val names = listOf("mary", "deneb", "john")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    /**
     * for each
     */
    for (name in names) {
        val r = name.replaceFirstChar { it.uppercase() }
        println(name)
    }

    /**
     *
     */
}