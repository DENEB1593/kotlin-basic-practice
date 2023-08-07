package collections

/**
 * List는 Array와 다르게 크기 확장, 축소가 동적으로 가능함.
 * 일반 자료구조 생각하면된다.
 * 다만 아래의 listOf는 immutable 기능이다.
 */
fun main() {
    val lists: List<String> = listOf(
        "a","b","c","d","e"
    )
    println(lists)
    println(lists[0]) // .get(i)
    println(lists.contains("c"))
    println("d" in lists)

    val elements: MutableList<String> = mutableListOf("1", "2", "3")
    elements.add("d")
    println(elements)

}