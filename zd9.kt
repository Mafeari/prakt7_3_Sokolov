import kotlin.math.*
fun main() {
    try {
        println("Введите длину прямоугольнука:")
        val length = readLine()!!.toDouble()
        println("Введите ширину прямоугольнука:")
        val width = readLine()!!.toDouble()
        when {
            length <= 0.0 -> throw IllegalArgumentException("Длинна должна быть положительной.")
            width <= 0.0 -> throw IllegalArgumentException("Ширина должна быть положительной.")
        }
        val perimeter = 2 * (length + width)
        val area = length * width
        val diagonal = sqrt(length * length + width * width)
        println("Периметр: ${"%.2f".format(perimeter)}")
        println("Площадь: ${"%.2f".format(area)}")
        println("Длина диагонали: ${"%.2f".format(diagonal)}")
    }catch (e: NumberFormatException) {
        println("Ошибка: Пожалуйста, введите корректные числовые значения.")
    }catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    }catch (e: Exception) {
        println("Произошла ошибка: ${e.message}")
    }
}