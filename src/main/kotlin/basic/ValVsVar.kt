package basic

/**
 * var: 재할당 가능
 * val: 재할당 불가능
 * final 키워드와 동일하다고 생각하면 된다.
 */
fun main(args: Array<String>) {
    var name = "deneb"
    val immutableName = "deneb"

    name = "deneb1234"
    // Val cannot be reassigned
//    immutableName = "deneb1234"
}