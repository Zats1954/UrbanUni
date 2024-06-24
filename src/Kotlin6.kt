import java.util.*

fun main() {
    Locale.setDefault(Locale.US)
// 1 -------------------------------------------------------------
    val sc = Scanner(System.`in`)
    println(" Введите  два числа ")
    var sum = 0.0
    for (i in 1..2) {
        sum += sc.nextDouble()
    }
    println("среднее арифметическое ${sum / 2}")
// 2 -------------------------------------------------------------
    println(" Введите  площадь круга")
    val s = sc.nextDouble() * 4 / 3.14
    var d = s / 2
    var d0 = d
    for (i in 1..20) {
        d = (s + d * d) / 2 / d
    }
    println(" Диаметр $d длина окружности ${d * 3.14}")
// 3 -------------------------------------------------------------
    println(" Введите координаты (x,y) левой верхней вершины прямоугольника")
    val x1 = sc.nextInt()
    val y1 = sc.nextInt()
    println(" Введите координаты (x,y) правой нижней вершины прямоугольника")
    val x2 = sc.nextInt()
    val y2 = sc.nextInt()
    var l = 0
    var s1 = 0
    var s2 = 0
    for (i in 1..2) {
        when (i) {
            1 -> l += x2
            2 -> l -= x1
        }
        s1 = l
    }

    for (j in 1..2) {
        when (j) {
            1 -> {l -= y2
                  s2 -= s1*y2}
            2 -> {l += y1
                  s2 += s1*y1 }
        }
    }
    println("периметр ${l*2} площадь $s2")
// 4 -------------------------------------------------------------
    var del = 1
    for (i in 1..10) {
        print("$del ")
        del *= 2
    }
    println()
// 5 -------------------------------------------------------------
    for (n in 20 downTo 0) {
        if (n % 2 == 0) {
            print("$n ")
        }
    }
}
