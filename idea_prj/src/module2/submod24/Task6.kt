package module2.submod24

fun main(){

}

fun engineStatus(engineNumber:Int): String {
    var result = ""
    try {
        result = rawEngineStatus(engineNumber);
    } catch (e: SensorsMeltException) {
        result = "engine $engineNumber offline"
    } catch (e: EngineNotFoundException) {
        result = "engine $engineNumber not found"
    }
    return result
}

class SensorsMeltException: Exception() {

}

class EngineNotFoundException: Exception() {

}

fun rawEngineStatus(engineNumber:Int):String{
    return ""
}