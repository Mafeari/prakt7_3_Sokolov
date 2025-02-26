fun main(){
    val x = 0.0
    val y = 0.0
    var result = ""
    try {
        when{
            y >= -1 && y <= 1 && x >= -3 && x <= 1 &&
                    (y <= (2.0 / 4) * (x + 3) - 1) && (y >= (-2.0 / 4) * (x + 3) - 1) -> {
                        result += "a, "
                    }
            (x in -2.0..2.0 && y in -1.0..1.0) ||
                    (x in -1.0..1.0 && y in 1.0..2.0 && y <= 2 - Math.abs(x)) -> {
                        result += "б, "
                    }
            (x in -1.0..1.0 && y in -1.0..1.0) ||
                    ((x * x + (y + 1) * (y + 1)) <= 1) -> {
                        result += "в, "
                    }
            (x in -2.0..2.0 && y in -2.0..2.0 && (Math.abs(x) + Math.abs(y) <= 2)) -> {
                result += "г, "
            }
            else -> {
                result = "Не принадлежит ни одной области"
            }
        }
        println("Принадлежит: $result")
    }catch (e: Exception) {
        println("Произошла ошибка: ${e.message}")
        return
    }
}