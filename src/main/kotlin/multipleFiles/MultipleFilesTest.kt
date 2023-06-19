package multipleFiles

fun main(args: Array<String>) {
    val person = Person("A", 13, Address("C", "S"))
    val newAddress = Address("C'", "S'")
    print(updateAddress(updateAge(person, 42), newAddress))
}