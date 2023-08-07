package conditionals

/**
 * 자바 switch -> 코틀린 when 문과 동일
 */
fun main() {
    val gender = "X"

    val result = when (gender) {
        "F" -> "FEMALE"
        "M" -> "MALE"
        else -> "UNKNOWN"
    }

    println(result)

}