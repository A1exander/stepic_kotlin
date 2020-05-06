package module2.submod22

/**
 * Циклы и ветвления
 */
fun main() {
    var a = 1
    when(a){
        5 -> println("5")
        6,7 -> println("6,7")
        in 1..10 -> println("1..10")
        in 0..200 -> {
            println("0..200")
            println("????")
        }
        else -> println("nothing")
    }
    println("=======TASK1=========")
    println(getYearEra(2097))
    println(getYearEra(2115))
    println(getYearEra(1985))
    println(getYearEra(2063))
    println(getYearEra(2144))
    println(getYearEra(1970))
}

fun getYearEra(year: Int): String{
    when{
        year == 1970 -> return("equals")
        year > 2100 -> return("distant future")
        year > 2000 -> return("after (XXI century)")
        year < 2000 && year > 1971 -> return("after (XX century)")
        year < 1970 -> return("before")
        else -> return("Forever Unix")
    }
}

