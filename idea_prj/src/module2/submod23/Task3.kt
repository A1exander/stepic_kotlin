package module2.submod23

/**
 * Наследование
 */
open class Bug(val rank: Int, val name:String) {
    open fun getSugarLimit(): Int{
        return rank
    }

    fun getId(): String{
        return "${rank}.${name}"
    }
}

class BugCivilian( rank: Int,  name:String): Bug(rank,name) {
    override fun getSugarLimit(): Int {
        return rank/2
    }
}