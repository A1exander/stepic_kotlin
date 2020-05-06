package module2.submod22

fun main() {
    println(calculateEvenDigits("660308340"))
}

fun calculateEvenDigits(input:String): Int{
    var sumInput:Int = 0
    for (i in input){
        var inti = i.toString().toInt()
        if (inti%2==0){
            sumInput += inti
        }
    }
    return sumInput
}




