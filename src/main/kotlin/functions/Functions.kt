package functions

/**
 * 코틀린 함수
 * Unit -> Void
 */
fun main() {
    val name = "deneb"
    val age = 30
    greet(name, age)

    // Named Parameter
    greet(name = "james", age = 15)

    // Default value argument
    greet(name = "kim")

    foo(
        name = "deneb",
        bar = {
            println("bar function !!")
        }
    )

    println(double(n = 10))
    println(triple(n = 10))


    val (v1, v2) = multipleVals()
    println("$v1 - $v2")

    val (t1, t2, t3) = multiple3Vals()
    println("$t1 - $t2 - $t3")

}

/**
 * 코틀린은 일급함수를 지원한다!
 */
fun foo(
    name: String,
    bar: () -> Unit
) {
    println("bar()")
    bar()
}

fun greet(name: String = "", age: Int = -1) {
    if (age == -1) {
        println("age does not provided")
        return
    }

    if (age >= 16)
        println("$name($age) is an adult")
}


fun double(n: Int): Int {
    return n * 2
}

/**
 * 단일 함수 표현식
 */
fun triple(n: Int): Int = n * 3


/**
 * 여러 값을 반환하는 함수,
 * 여러 값을 내포하는 모델을 만들지 않아도 되는 편리함이 돋보인다.
 */
fun multipleVals(): Pair<String, Int> {
    return "Deneb" to 30
}

fun multiple3Vals(): Triple<String, Int, Char> {
    return Triple("Deneb", 30, 'A')
}
