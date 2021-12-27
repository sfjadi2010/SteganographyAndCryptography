// TODO: provide three functions here
fun identity(value: Int): Int = value
fun half(value: Int): Int = value / 2
fun zero(value: Int): Int = 0

fun generate(functionName: String): (Int) -> Int {
    // TODO: provide implementation here
    if (functionName == "identity") return ::identity
    if (functionName == "half") return ::half
    return ::zero
}