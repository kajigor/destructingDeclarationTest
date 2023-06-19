package multipleFiles

fun updateAge(person: Person, age: Int): Person {
    val (name, _, address) = person
    return Person(name, age, address)
}