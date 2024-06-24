import java.util.*

fun main() {
    Locale.setDefault(Locale.US)
// 1 -------------------------------------------------------------
    val sc = Scanner(System.`in`)
    println(" Введите  целое число >0")
    val n = sc.nextInt()
    var sum = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
    }
    println("сумма ряда $sum")
// 2 -------------------------------------------------------------
    println(" Введите два целых числа a и b (a<b)")
    val a = sc.nextInt()
    val b = sc.nextInt()
    var sum1 = 0.0
    for (i in a..b) {
        sum1 += i * i
    }
    println("сумма ряда $sum1")
// 3 -------------------------------------------------------------
    println(" Введите два целых числа a и b (a<b)")
    val a1 = sc.nextInt()
    val b1 = sc.nextInt()
    var count = 1
    for (i in a1..b1) {
        for (j in 1..count) {
            print("$i ")
        }
        count++
        println()
    }
// 4 -------------------------------------------------------------
    println(" Введите  положительное целое число ")
    val n1 = sc.nextInt()
    var check = true
    if (n1 > 3) {
        for (i in 2..n1 / 2) {
            if (n1 % i == 0) {
                check = false
            }
        }
    }
    println("число $n1 простое ? $check")
// 5 -------------------------------------------------------------
    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
    var answer = " "
    for (i in 1..3) {
        answer = sc.next()
        if (answer.equals("Троллейбус")) {
            println("Правильно!")
            break
        } else if (answer.equals("Сдаюсь")) {
            println("Правильный ответ: Троллейбус")
            break
        }
        if (i < 3) {
            println("Подумай еще")
        }
    }
}
