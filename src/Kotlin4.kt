import java.util.*

fun main() {
// 1 -------------------------------------------------------------
    val sc = Scanner(System.`in`)
    println(" Введите порядковый номер месяца ")
    val month = sc.nextInt()
    print(" Это ")
    println(
        when (month) {
            1 -> "Зима: январь"
            2 -> "Зима: февраль"
            3 -> "Весна: март"
            4 -> "Весна: апрель"
            5 -> "Весна: май"
            6 -> "Лето: июнь"
            7 -> "Лето: июль"
            8 -> "Лето: август"
            9 -> "Осень: сентябрь"
            10 -> "Осень: октябрь"
            11 -> "Осень: ноябрь"
            12 -> "Зима: декабрь"
            else -> "Неправильный номер  месяца"
        }
    )
// 2 -------------------------------------------------------------
    println(" Введите число с плавающей точкой ")
    val number = sc.nextDouble()
    val result = when ((number - number.toInt()) >= 0.5) {
        true -> number.toInt() + 1
        false -> number.toInt()
    }
    println("округленное число $result")
// 3 -----------------------------------------------------------------
    println(" Введите текущий час (0 - 23) ")
    val time = when (sc.nextInt()) {
        0, 1, 2, 3, 4, 5 -> "Раннее утро"
        6, 7, 8, 9, 10, 11 -> "Утро"
        12, 13, 14, 15, 16, 16 -> "День"
        17, 18, 19, 20 -> "Вечер"
        21, 22, 23 -> "Поздний вече"
        else -> "Введен неправильный текущий час "
    }
    println("текущее время суток $time")
// 1.4 ----------------------------------------------------------------------
    var a = 8
    var b = 5
    println(" Для чисел $a и $b перестановка будет")
    a = a - b
    b = a + b
    a = b - a
    println(" $a и $b")
}