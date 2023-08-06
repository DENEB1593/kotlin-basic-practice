package basic

/**
 * + 연산시 타입에 의해 수행이 달라짐.
 */
fun main(args: Array<String>) {
    val sum = 10 + 10
    val sumStr = "10" + "10"
    println("sum with nums: $sum") // 20
    println("sum with numStr: $sumStr") // 1010
}