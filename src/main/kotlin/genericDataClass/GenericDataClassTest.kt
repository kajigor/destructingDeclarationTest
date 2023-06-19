package genericDataClass

data class MyPair<A, B>(val x: A, val y: B)

fun <A, B> constructMyPair(first: A, second: B): MyPair<A, B> {
    return MyPair(first, second)
}

fun main(args: Array<String>) {
    val (first, second) = constructMyPair("", 0)
}