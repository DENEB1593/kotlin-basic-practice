package basic

/**
 * Deneb는 Heap 영역의 String Pool에 저장된다.
 * ==, === 연산자를 지원한다.
 */
fun main(args: Array<String>) {
    val name1 = "Deneb"
    val name2 = "Rigel"
    val name3 = "Deneb"
    val name4 = String("Deneb".toCharArray())

    println(name1 == name2) // false
    println(name1 === name2) // false
    println(name1.equals(name2)) // false
    println(name1 == name3) // true
    println(name1 === name3) // true
    println(name1.equals(name3)) // true

    // 다른 메모리니까..
    println(name1 === name4) // false

}