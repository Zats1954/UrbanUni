import java.util.*

fun main() {
    Locale.setDefault(Locale.US)
// 1 -------------------------------------------------------------
    val firstArray = arrayOf(1.0, 6.28, 8.124, 3.5746,1.56,1.58,4.8,2.56,3.57,1.51)
    var multiply = 1.0
       for(item in firstArray){
           multiply *= item
       }
    println(multiply)
// 2 -------------------------------------------------------------
    val secondArray = arrayOf<Int>(1, 6, 8, 3, 10, 12, 4, 2)
    var averageValue  = secondArray.average()
    println(averageValue)
// 3 -------------------------------------------------------------
    val size = 9
    var thirdArray = IntArray(size)
    thirdArray = intArrayOf(1, 6, 8, 3, 10, 12, 4, 2, 15)
    var count = 0
    for(i in thirdArray){
        if(i % 2 == 0){
            print("$i; ")
            count++
        }
    }
    println()
    println("в массиве $count четных чисел")
// 4 -------------------------------------------------------------
    val N = 9
    val fourthdArray = IntArray(N)
    var tmp = 1
    for(i in fourthdArray.indices){
        tmp *= 2
        fourthdArray[i] = tmp
        }
        println(fourthdArray.contentToString())
    }