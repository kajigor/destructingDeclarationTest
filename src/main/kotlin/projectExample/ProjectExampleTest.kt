package projectExample

fun projectExampleTest(args: Array<String>) {
    val address = Address("A", "S")
    val person = Person("K", 42, address)
    val (name, age, add) = person
    val (city, street) = add
    println(name)
    println(age)
}