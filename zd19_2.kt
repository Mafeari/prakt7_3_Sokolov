import kotlin.math.*
fun main() {
    try {
        println("Введите координаты первого прямоугольника:")
        println("x1:")
        val x1 = readLine()!!.toDouble()
        println("y1:")
        val y1 = readLine()!!.toDouble()
        println("x2:")
        val x2 = readLine()!!.toDouble()
        println("y2:")
        val y2 = readLine()!!.toDouble()
        println("Введите координаты второго прямоугольника:")
        println("x3:")
        val x3 = readLine()!!.toDouble()
        println("y3:")
        val y3 = readLine()!!.toDouble()
        println("x4:")
        val x4 = readLine()!!.toDouble()
        println("y4:")
        val y4 = readLine()!!.toDouble()
        val interX1 = max(x1, x3)
        val interY1 = max(y1, y3)
        val interX2 = min(x2, x4)
        val interY2 = min(y2, y4)
        println("$interX1,$interY1,$interX2,$interY2")
        val interWidth = interX2 - interX1
        val interHeight = interY2 - interY1
        val area = when {
            interWidth > 0 && interHeight > 0 -> interWidth * interHeight
            else -> 0.0
        }
        println("Площадь пересечения: %.2f".format(area))
    }catch (e:NumberFormatException){
        println("Ошибка: Пожалуйста, введите корректные числовые значения.")
    }catch (e:Exception){
        println("Произошла непредвиденная ошибка: ${e.message}")
    }
}