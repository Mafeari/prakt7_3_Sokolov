fun main(){
    val density  = 7.9
    val molarMass = 56.0
    val avogadroNumber = 6.02e23
    try {
        println("Введите объём (V) железа в см^3:")
        val volume = readLine()!!.toDouble()
        when {
            volume <= 0.0 -> throw IllegalArgumentException("Объём должен быть положительным.")
        }
        val mass = density * volume
        val moles = mass / molarMass
        val numberAtoms = moles * avogadroNumber
        println("Количество атомов в объёме $volume см^3 железа: ${"%.2e".format(numberAtoms)}")
    }catch (e: NumberFormatException) {
        println("Ошибка: Пожалуйста, введите числовое значение.")
    }catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
    }catch (e: Exception) {
        println("Произошла непредвиденная ошибка: ${e.message}")
    }
}