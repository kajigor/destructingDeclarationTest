package withExpression

import java.util.*

data class Address(val city: String, val street: String)
fun toLower(address: Address): Address {
    val (city, street) = with(address) {
        Address (
            this.city.lowercase(Locale.getDefault()),
            this.street.lowercase(Locale.getDefault())
        )}
    return Address(city, street)
}
fun main(args: Array<String>) {
    val address = Address("C", "S")
    print(toLower(address))
}