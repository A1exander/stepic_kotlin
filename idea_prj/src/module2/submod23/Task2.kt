package module2.submod23

class SugarStorage (var startVolume:Int){

    var volume:Int = startVolume

    fun decreaseSugar(v:Int) {
        if (v < 0) return
        volume -= v
        if (volume < 0) {
            volume = 0
        }
    }
    fun increaseSugar(v:Int) {
        if (v < 0) return
        volume += v
        if (volume < 0) {
            volume = 0
        }
    }
}