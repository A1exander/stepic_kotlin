package module2.submod25

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