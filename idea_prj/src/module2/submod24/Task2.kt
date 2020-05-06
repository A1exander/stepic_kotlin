package module2.submod24

fun main () {
    println( calculateWordStat("PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC DTQEHGC PDDPEM"))
    println( calculateWordStat("KTTKAP ZSAC RKSLNFE LYAB ZSAC ZSAC NQUZKL LYAB ZSAC KTTKAP ZSAC ZSAC KTTKAP RKSLNFE ZSAC ZSAC RKSLNFE LYAB ZSAC RKSLNFE KTTKAP LYAB RKSLNFE NQUZKL RKSLNFE LYAB RKSLNFE RKSLNFE LYAB RKSLNFE KTTKAP ZSAC RKSLNFE KTTKAP ZSAC LYAB LYAB LYAB RKSLNFE ZSAC"))
    println( calculateWordStat("BAMMWC ZTSKPZ LLXMOU BAMMWC BAMMWC BAMMWC IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB LLXMOU GSLXNL BAMMWC GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL LLXMOU GSLXNL IFYXBAB GSLXNL GSLXNL GSLXNL IFYXBAB IFYXBAB IFYXBAB GSLXNL IFYXBAB LLXMOU BAMMWC IFYXBAB ZTSKPZ BAMMWC BAMMWC BAMMWC IFYXBAB LLXMOU"))
}

fun calculateWordStat(input:String): String{
    var strCount: Int = 0

    var maxCount: Int = 0
    var maxStr = ""

    var inputList = input.split(" ")

    for (i in inputList) {
        strCount = 0
        for (j in inputList) {
            if (i == j) {
                strCount++
            }
            if (strCount > maxCount) {
                maxStr = i
                maxCount = strCount
            }
        }
    }

    return maxStr
}