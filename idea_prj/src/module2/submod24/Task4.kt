package module2.submod24

fun main () {
    checkClient("dog")
}

fun checkClient(client : String) {
    when {
        client.contains("dog") ->  throw DogException()
        client.contains("cat") ->  throw CatException()
    }
}

class DogException() : Exception()
class CatException() : Exception()