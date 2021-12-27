const val THREE = 3
fun main() {
    val array3D = arrayOf(
        arrayOf(IntArray(THREE), IntArray(THREE), IntArray(THREE)),
        arrayOf(IntArray(THREE), IntArray(THREE), IntArray(THREE)),
        arrayOf(IntArray(THREE), IntArray(THREE), IntArray(THREE))
    )

    println(array3D.contentDeepToString())
}