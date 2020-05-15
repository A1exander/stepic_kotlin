package module2.submod25


fun getLength(str: String?): Int? {
    str?.let { return it.length }
    return null
}