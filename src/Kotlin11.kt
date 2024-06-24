fun main() {
println("1 ---------------------------------------------------------------------------")
    val a = arrayOf(12.3, 15.4, 13.3, 14.5, 10.6, 9.8, 8.3, 9.6, 8.7, 9.3)
    val n = 3.0
    val b = 30
    println("${a.contentToString()}}")
    println("Число локальных минимумов в массиве  ${locMin(a)}")
println("2 ---------------------------------------------------------------------------")
    val c = intArrayOf(12, 15, -13, 14, -10, 9, 8, 9, 8, -9)
    println("${c.contentToString()}}")
    println("${findNegative(c).contentToString()}}")
println("3 ---------------------------------------------------------------------------")
    val d = arrayOf(
        arrayOf(3.2, 14.8, 80.0, 13.1, 15.4),
        arrayOf(1.5, 3.4, 21.3, 7.8, 6.1),
        arrayOf( 13.5, 19.9, 28.3, 10.1, 12.6)
    )
    println(" ${getRow(d,0).contentToString()}")
}

fun locMin(a: Array<Double>): Int {
    var nextMin = IntArray(a.size) { 0 }
    var checkNumber = a[0]
    for (i in 1 until a.size - 1) {
        if (a[i] < checkNumber) {
            nextMin[i] = 1
        } else {
            nextMin[i] = 0
        }
        checkNumber = a[i]
    }
    for (i in 1 until a.size - 2) {
        if(nextMin[i+1] == 1 ){nextMin[i] = 0}
    }
    return nextMin.count {  it == 1 }
//    println("${nextMin.contentToString()}")
}

fun findNegative(b: IntArray): IntArray {
    var ab = b
    for(i in ab.indices){
        if(ab[i] < 0){
            ab[i] += 1
//  Уточните постановку задачи  ЭТОТ элемент или ЭТИ элементы
//  Если подразумевается " увеличить ТОЛЬКО ЭТОТ элемент на единицу", а остальные побоку, то
//            break
        }
    }
    return ab
}

fun getRow(d: Array<Array<Double>>, i: Int): Array<Double> {
    if(i in d.indices){
        return d[i]
    } else throw ArrayIndexOutOfBoundsException()
}
