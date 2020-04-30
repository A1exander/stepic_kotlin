package module2.submod22

/**
 * Циклы и ветвления
 */
fun main() {
    var a = 1
    when(a){
        5 -> print("5")
        6,7 -> print("6,7")
        in 1..10 -> print("1..10")
        in 0..200 -> {
            print("0..200")
            print("????")
        }
        else -> print("nothing")
    }
}