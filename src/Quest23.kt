fun main(args: Array<String>) {
    val mark2 = Car("Toyota", "Black", "у356хк750")
    val bmw = Car("BMW", "Red", "г568пн750")

    println(mark2.toString())
    println(bmw.toString())
}

data class Car(val brand: String, val color: String, val number: String) {
    override fun toString(): String {
        return "Brand: $brand\tColor: $color\tNumber: $number"
    }
}