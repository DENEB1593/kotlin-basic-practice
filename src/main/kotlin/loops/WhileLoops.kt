package loops

fun main() {
    val names = listOf(
        "apple",
        "deneb",
        "park"
    )

    var idx = 0
    while (idx <= names.size - 1) {
        println(names.get(idx))
        idx++
    }

}