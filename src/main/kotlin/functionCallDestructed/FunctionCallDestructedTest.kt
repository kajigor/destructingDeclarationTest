package functionCallDestructed

data class Address(val city: String, val street: String)
data class Person(val name: String, val age: Int, val address: Address )

fun updateAge(age: Int, person: Person): Person {
    val (name, _, address) = person
    return Person(name, age, address)
}

fun main(args: Array<String>) {
    val sampleAddress = Address("C", "S")
    val person = Person("K", 42, sampleAddress)
    val (name, newAge, address) = updateAge(55, person)
}

