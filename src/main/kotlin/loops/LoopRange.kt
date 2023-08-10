package loops

/**
 * 코틀린은 범위 지정을 효율적으로 해준다.
 */
fun main() {
//    for (i in 10..100)  println(i)
//    for (i in 10 downTo 1) { println(i) }

    // 2씩 증가
    for (i in 1..5 step 2) println(i)

    // 2씩 감소
    for (i in 5 downTo 1 step 2) println(i)

}