package basic

/**
 * 코틀린은 NULL-Safe를 강조한다!
 */
fun main(args: Array<String>) {
    var name = "deneb"
    println(name.uppercase())

    /**
     * NULL이 될수 있다는 표현
     * Java의 경우 NPE가 발생하겠지만 Kotlin은 null이 출력되어 NPE에 보다 안전하다.
     */
    var brand: String? = null
    println(brand?.uppercase())

}