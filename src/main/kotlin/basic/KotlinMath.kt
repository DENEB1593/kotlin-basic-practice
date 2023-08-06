package basic

import kotlin.math.max
import kotlin.math.min

/**
 * Java Math와 비슷하다.
 * 어지간한 수학 관련 메소드를 지원한다.
 */
fun main() {
    val num1 = 10
    val num2 = 3
    println(kotlin.math.PI)
    println("max $num1 and $num2: ${max(num1, num2)}")
    println("min $num1 and $num2: ${min(num1, num2)}")
}