package conditionals

fun main() {
    /**
     * Boolean이 NULL일 수 있는 경우 방어법이다.
     */
    val isAdult: Boolean? = null
    if (isAdult != true) {
        println("not true")

    }
}