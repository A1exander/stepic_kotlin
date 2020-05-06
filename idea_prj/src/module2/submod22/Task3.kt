package module2.submod22

fun main() {
    var g = "KLPQYM BUG KHQR KLPQYM JVOJTD JVOJTD BUG BUG KHQR BUG KLPQYM JVOJTD KLPQYM JVOJTD QLSPA KHQR JVOJTD KLPQYM JVOJTD KLPQYM KLPQYM JVOJTD JVOJTD BUG KLPQYM KHQR JVOJTD KHQR KLPQYM KLPQYM JVOJTD KLPQYM BUG BUG BUG"
    println(calculateBugMentions(g.split(" ")))
}

fun calculateBugMentions(input:List<String>): Int{
    var bugCount = 0
    for (i in input) {
        if (i == "BUG"){
            bugCount++
        }
    }
    return bugCount
}