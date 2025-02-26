fun main() {
    try {
        println("Введите значение k:")
        val k = readLine()!!.toInt()
        println("Введите значение l:")
        val l = readLine()!!.toInt()
        println("Введите значение n:")
        val n = readLine()!!.toInt()
        println("Введите значение m:")
        val m = readLine()!!.toInt()
        when {
            k == 0 -> println("Ошибка: k не может быть 0.")
            else -> println("Число $k является делителем всех чисел $l, $n и $m: ${l % k == 0 && n % k == 0 && m % k == 0}")
        }
    }catch (e: Exception) {
        println("Ошибка: Убедитесь, что все значения являются целыми числами.")
    }
}