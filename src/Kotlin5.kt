import java.text.DecimalFormat
import java.util.*

fun main() {
    Locale.setDefault(Locale.US)
// 1 -------------------------------------------------------------
    val sc = Scanner(System.`in`)
    println(" Введите  положительное целое число ")
    val numer = sc.nextInt()
    var factorial = numer
    if (numer < 0) {
        println(" Ошибка! введено отрицательное целое число ")
    } else {
        if (numer > 0) {
            var i = numer
            while (--i > 0) {
                factorial *= i
            }
        } else {
            factorial = 1
        }
        println("$numer! = $factorial")
    }

// 2 -------------------------------------------------------------
    println(" Введите цену 1 кг конфет ")
    val number = sc.nextDouble()
    var j = 1
    do {
        println("цена $j кг конфет равна ${number * j}")
    } while (j++ < 10)

// 3 -----------------------------------------------------------------
    println(" Введите  два целых числа ")
    val a = sc.nextInt()
    val b = sc.nextInt()
    val maxAB = a.coerceAtLeast(b)
    var k = a.coerceAtMost(b)
    println("целые числа в диапазоне ($k:$maxAB)")
    do {
        print("$k; ")
    } while (k++ < maxAB)
    println()

// 4 ----------------------------------------------------------------------
    println(" Введите  положительное целое число ")
    val numer1 = sc.nextInt()
    var m = numer1
    println(" цифры числа $numer1 справа налево ")
    do {
        print("${m % 10}; ")
        m /= 10
    } while (m > 0)
    println()
// 5 ----------------------------------------------------------------------
    println(
        " Вывод числа от 1 до 20 включительно" +
                " со следующими условиями: если числа нечетные – их не выводить на экран," +
                " если делятся на 4 без остатка – умножаем на 2, если число равно 19 завершаем программу "
    )
    var n = 0
    var tmp = 0
    while (n++ != 19){
        tmp = n
        if((tmp % 2)==0){
            if (tmp % 4 == 0){
                tmp *= 2
            }
            print("$tmp; ")
        }
    }
    println()

// 6 ----------------------------------------------------------------------
   var account = 350.00
   val duration = 9
   val procent = 1.07
    println(" Вывод текущей суммы на счете по месяцам за $duration месяцев при начальном вкладе $account " +
            "и комиссии $procent в месяц "
    )
   var month = 0
   while(month++ < duration){
       account *= procent
       account = DecimalFormat("0.00").format(account).toDouble()
       println(" $month месяц $account")
   }
}
