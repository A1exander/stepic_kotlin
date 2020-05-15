package module2.submod25

fun main () {

}

fun getLength3(str: String?):Int{
    return (str?.length) ?: throw NullPointerException()
}