package multipleFiles

fun updateAddress(person: Person, address: Address): Person {
    val (name, age, _) = person
    return Person(name, age, address)
}