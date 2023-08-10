package classes

fun main() {
    //val tv = Device("samsung tv", 1_000.0)
    val tv = Device("samsung tv" )
    println("${tv.brand} ${tv.price}")

    val phone = Device("apple iphone", 500.0)
    println("${phone.brand} ${phone.price}")
    phone.turnOn()
    phone.getDeviceState()

    val laptop = Device("lg laptop")
    println(laptop)



    // 동위성
    val tv1 = Device("samsung tv", 2_000.00)
    val tv2 = Device("samsung tv", 2_000.00)
    println(tv1 == tv2)
    println(tv1 === tv2) // memory location 비교

}


/**
 * 코틀린은 여러 외부 클래스를 선언할 수 있다.
 */
class Device (
    var brand: String,
    var price: Double,
    var isSwitchedOn: Boolean? = false
) {

    constructor(
        brand: String
    ): this(brand, 0.0)

    // getter / setter 는 기본적으로 구현되어 있다.
    // setter를 막지 못하는 걸로 보인다.

    fun getDeviceState() {
        println("state: $isSwitchedOn")
    }

    // method
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is turn on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is turn off")
    }

    // toString 구현은 동일함!
    override fun toString(): String {
        return "Device(brand='$brand', price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Device

        if (brand != other.brand) return false
        if (price != other.price) return false
        return isSwitchedOn == other.isSwitchedOn
    }

    override fun hashCode(): Int {
        var result = brand.hashCode()
        result = 31 * result + price.hashCode()
        result = 31 * result + (isSwitchedOn?.hashCode() ?: 0)
        return result
    }


}