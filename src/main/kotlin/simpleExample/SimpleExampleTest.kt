package simpleExample

import multipleDestuctiveDeclarations.Address
import multipleDestuctiveDeclarations.Person

data class Address(val city: String, val street: String)
data class Person(val name: String, val age: Int, val address: Address)

fun simpleExampleTest(args: Array<String>) {
    val address = Address("A", "S")
    val person = Person("K", 42, address)
    val (name, age, add) = person
    val (city, street) = add
    println(name)
    println(age)
}