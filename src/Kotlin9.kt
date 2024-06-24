import java.util.*

fun main() {
    Locale.setDefault(Locale.US)
// 1 -------------------------------------------------------------
    val firstArray = arrayOf(
        arrayOf(1, 6, 8),
        arrayOf(3, 5, 11),
        arrayOf(4, 2, 7)
    )
    var minElement = Int.MAX_VALUE
    var rowMin = 0
    var columnMin = 0
    for (i in firstArray.indices) {
        for (j in firstArray[i].indices) {
            if (firstArray[i][j] < minElement) {
                minElement = firstArray[i][j]
                rowMin = i + 1
                columnMin = j + 1
            }
        }
    }
    println("минимальный элемент $minElement в строке $rowMin столбце $columnMin")
// 2 -------------------------------------------------------------
    val secondArray = arrayOf(
        arrayOf(1, 18, 80, 3, 15),
        arrayOf(11, 34, 2, 7, 6),
        arrayOf( 13, 9, 8, 10, 12)
    )

    val newArray = arrayOfNulls<Int>(15)
    for (i in secondArray.indices) {
        for (j in secondArray[i].indices) {
            newArray[i*5 + j] = secondArray[i][j]
        }
    }
    newArray.sort()
    println(newArray.contentToString())
    println("медиана массива secondArray ${newArray[7]} ")
// 3 -------------------------------------------------------------
    val size = 9
    var thirdArray = arrayOf(
        arrayOf(0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0)
    )

    for (i in thirdArray.indices) {
        if (i > 1) {
            var begin = 4 - i
            for (j in begin..i) {
                thirdArray[i][j] = 1
            }
        }
    }
    println(thirdArray.contentDeepToString())
// 4 -------------------------------------------------------------
    val fourthArray = arrayOf(1, 6, 8, 3, 5, 11, 4, 2, 7, 6, 13, 9, 8, 10, 12)
    var firstMax = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE
    for (i in 0..fourthArray.size - 1) {
        if (firstMax < fourthArray[i]) {
            secondMax = firstMax
            firstMax = fourthArray[i]
        } else if (secondMax < fourthArray[i]) {
            secondMax = fourthArray[i]
        }
    }
    println("второе максимальное число $secondMax")
}