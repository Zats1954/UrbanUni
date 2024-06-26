import java.util.*

fun main() {
    println("1 ---------------------------------------------------------------------")
    val fireStation: FireFighter = FireFighter("П412", "+449-897-98-95")
    fireStation.addMember("Петров")
    fireStation.addMember("Иванов")
    fireStation.addMember("Сидоров")
    fireStation.addCase("21.01 пожар на ул.Береговая, д.3 ")
    fireStation.addCase("15.02  пожар на ул.Солнечная, д.12 ")
    fireStation.addCase("1.03  пожар на ул.Семеновская, д.36  ")
    fireStation.addCase("25.03  пожар на ул.Базарная, д.15  ")
    println(fireStation.getDescription())
    println("в составе  ")
    println(fireStation.info(fireStation.getMembersList()))
    println("тушила пожары ")
    println(fireStation.info(fireStation.getCasesList()))

    println("2 ---------------------------------------------------------------------------")
    val sc = Scanner(System.`in`)
    println("Введите два целых положительных числа")
    var a = sc.nextInt()
    var b = sc.nextInt()
    if (a < b) {
        a = a - b
        b = a + b
        a = b - a
    }
    println("НОД для $a и $b = ${nodEvklid(a, b)}")

    println("3 ---------------------------------------------------------------------------")
    println("Введите размер набора целых чисел")
    val size = sc.nextInt()
    val array = Array(size) { 0 }
    for (i in array.indices) {
        println("Введите очередное число")
        array[i] = sc.nextInt()
    }
    println("в массиве ${array.contentToString()}")
    array.sort()
    println("второе максимальное число ${array[size - 2]}")
}


interface Description {
    fun getDescription(): String
}

abstract class EmergencyService(val name: String, val phone: String) : Description {

    abstract fun getMembersList(): Set<String>
    abstract fun getCasesList(): Set<String>
    open fun info(set: Set<String>): String {
        val str: StringBuffer = StringBuffer()
        set.forEach {
            str.append("  $it \n")
        }
        return str.toString()
    }
}

class FireFighter(name: String, phone: String) : EmergencyService(name, phone) {
    private val members: MutableSet<String> = mutableSetOf()
    private val cases: MutableSet<String> = mutableSetOf()

    override fun getMembersList(): Set<String> {
        return members
    }

    override fun getCasesList(): Set<String> {
        return cases
    }

    override fun getDescription(): String {
        return "Пожарная служба $name телефон $phone"
    }

    fun addMember(member: String) {
        members.add(member)
    }

    fun addCase(case: String) {
        cases.add(case)
    }
}

fun nodEvklid(a: Int, b: Int): Int {
    var c = a % b
    if (c != 0) {
        return nodEvklid(b, c)
    } else {
        return b
    }
}
