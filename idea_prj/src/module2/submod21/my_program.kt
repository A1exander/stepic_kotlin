package module2.submod21

/**
 * Базовый модуль. Переменные. HelloWorld. Потоки ввода/вывода
 */
fun main(args: Array<String>) {
//    println("Hello brave citizen of glorious Bug Kingdom!")
//
//    var a = readLine()
//    println("Oh mighty ruler of Bug Kingdom, the earthling called ${a} seeks for your wisdom!")
//
//    print(sum(2,2))

//    println(calcChairs(12))
    println(calcBugMoneyValue(10, 2, 25))
}

fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    return (42+(dayNumber*bugRank))*cashAmount
    //enter your function implementation here

}

fun sum (a:Int = 0, b:Int = 2):Int {
    return a+b
}

fun calcChairs(bugs: Int): Int {
    // enter your function code here
    return bugs + (bugs/2)
}