import java.util.*

fun main() {
println("1 ---------------------------------------------------------------------------")
    val box = Box(20, 16, 12)
    println("Объем box ${box.volume()}")
println("2 ---------------------------------------------------------------------------")
    println("Введите количество чисел в наборе")
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    val array = IntArray(n) { (0..50).random() }
    println(array.contentToString())
    val arrayA = MyClass(array)
    println(arrayA.toString())

println("3 ---------------------------------------------------------------------------")
    val array1 = arrayOf(3, 67, 1, 55, 65, 89, 23)
    val array2 = MyClass1(array1)
    println(array2.toString())
println("4 ---------------------------------------------------------------------------")
    println("Введите любое целое число")
    val m = sc.nextInt()
    val info = MyClass2(m)
    println("число $m $info")
println("5 ---------------------------------------------------------------------------")
    val car = Car(1480, 200, "телега")
    repeat(5) {
        print(" ${car.name} ${car.move()} ")
        print(" ${car.name} ${car.stop()} ")
    }
    println()
    println("Вам нужна такая машина?")
}


class Box(width: Int, height: Int, depth: Int) {
    val width = width
    val height = height
    val depth = depth
    fun volume(): Int {
        return width * height * depth
    }
}

class Car(weight: Int, speed: Int) {

    val weight = weight
    val speed = speed
    var name = " "

    constructor(weight: Int, speed: Int, name: String) : this(weight, speed) {
        this.name = name
    }

    fun move(): String {
        return "движется"
    }

    fun stop(): String {
        return "останавливается"
    }
}


class MyClass(array: IntArray) {
    private val array1 = array

    override fun toString(): String {
        val str = StringBuffer()
        str.append("минимальное число в наборе ${minArray(array1)} ")
        str.append("максимальное число в наборе ${maxArray(array1)} ")
        return str.toString()
    }

    private fun minArray(array: IntArray): Int {
        var minNumber = Int.MAX_VALUE
        for (i in array.indices) {
            if (array[i] < minNumber) {
                minNumber = array[i]
            }
        }
        return minNumber
    }

    private fun maxArray(array: IntArray): Int {
        var maxNumber = Int.MIN_VALUE
        for (i in array.indices) {
            if (array[i] > maxNumber) {
                maxNumber = array[i]
            }
        }
        return maxNumber
    }
}

class MyClass1(array: Array<Int>) {
    private val array1 = array

    override fun toString(): String {
        val str = StringBuffer()
        for (i in array1.indices) {
            str.append("$i элемент массива ${array1[i]}\n")
        }
        return str.toString()
    }
}

class MyClass2(number: Int) {
    private val number = number

    override fun toString(): String {
        val positive = if (number > 0) 1 else {
            if (number < 0) -1 else -3
        }
        val odd = if (number % 2 == 0) 1 else 0
        val str = when (positive + odd) {
            2 -> "положительное четное число"
            1 -> "положительное нечетное число"
            0 -> "отрицательное четное число"
            -1 -> "отрицательное нечетное число"
            -2 -> "нулевое число"
            else -> "ошибка функции MyClass2.toString()"
        }
        return str
    }
}