package collections

/**
 * 코틀린에서 array는?
 */
fun main() {
    /**
     * <T>에 타입을 지정할 수 있다. 안하면 Any를 기본으로 지정한다.
     */
    val names = arrayOf<String>("deneb", "future")
    
    println(names.contentToString())    // [deneb, future]
    // names[0]
    println(names.size)


    /**
     * in 키워드는 contains와 동일한 역할을 한다.
     */
    if ("deneb" in names) {
        println("deneb found")
    }

    /**
     * 빈 array 생성
     */
    val arrayOfNulls = arrayOfNulls<String>(5)
    println(arrayOfNulls.contentToString())

    arrayOfNulls.fill("*")

    println(arrayOfNulls.contentToString())

}