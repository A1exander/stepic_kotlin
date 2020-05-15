package module2.submod25

fun main() {
    println(getLength2("MT3C0V5IA7EN2VLEAJYU3PWHJ6X4OGGXIHBHHKLYQZH5738HNVZRTGO0MHGRZGZDKDS9SIQ7S3Q5L9L2QISAXDRW1W7F156SYM"))
    println(getLength2(null))
}

fun getLength2(str: String?):Int{
    return (str?. length) ?: 0
}