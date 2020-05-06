package module2.submod24

fun main() {
    println(getCubeList(7))
    println(getCubeList(1))
    println(getCubeList(9))
}

fun getCubeList(n: Int): List<Int> {
    val result: MutableList<Int> = mutableListOf<Int>()
    for (i in 0 until n) {
        result.add((i * i * i))
    }
    return result
}