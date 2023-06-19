package multipleDestuctiveDeclarations

data class Address(val city: String, val street: String)
data class Person(val name: String, val age: Int, val address: Address)

fun main(args: Array<String>) {
    val sampleAddress = Address("C", "S")
    val person = Person("K", 42, sampleAddress)
    val (name0, age0, add) = person
    val (name, age, address) = person
    val (_, age2, address2) = person
}