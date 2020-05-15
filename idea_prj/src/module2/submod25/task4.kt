package module2.submod25

fun main() {
    var someArr = calcNullValues(arrayOf(
        82, null, null, null, null, null, 7, 55, null, 59, 4, 25,
        null, null, 66, null, 3, 62, 55, null, 42, 5, 35, 8, null))
    someArr.forEach { print("$it ") }
}

fun calcNullValues(input: Array<Int?>):Array<Int>{
    var result: Array<Int> = arrayOf(0,0)
    for (i in input){
        i?.let {result[1] += i}
        if (i == null) {
            result[0] += 1
        }
    }
    return result
}

fun greateCalcNullValues(input: Array<Int?>) = arrayOf(input.count{it==null}, input.sumBy { it ?: 0 })

