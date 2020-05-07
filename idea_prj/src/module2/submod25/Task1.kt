package module2.submod25

fun getCubeList(n: Int):List<Int> {
    val result : MutableList<Int> = mutableListOf<Int>()
    for (i in 0 until n) {
        result.add((i*i*i))
    }
    return result
}