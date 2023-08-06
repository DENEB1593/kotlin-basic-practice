package basic

/**
 * Kotlin의 문자열 지원
 */
fun main(args: Array<String>) {
    val name: String = "deneb"
    println(name.plus(" 1234"))
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println("".isEmpty())

    val age = 100

    /**
     * String template 을 지원한다
     */
    val msg = "I am ${name.uppercase()} ($age)"
    println(msg)

    /**
     * 다중 문자열 (Java String Format과 비슷한듯)
     */
    val email = """
        This is %s
        How are you?
    """.trimIndent()
    println(email.format(name))
}