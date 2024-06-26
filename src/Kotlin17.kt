import java.util.*

fun main() {
    println("1 ---------------------------------------------------------------------")
    val magnit: Shop = Magnit("Moscow", "Lublino")
    val pyaterochka: Shop = Pyaterochka("Bransk", "Volodarka")
    magnit.addEmployees(10)
    magnit.getReceipts(150000.0)
    pyaterochka.addEmployees(8)
    pyaterochka.getReceipts(60000.0)
    println("${magnit.info()}")
    println("${pyaterochka.info()}")
    println("2 ---------------------------------------------------------------------------")
    val student = Student("Иван", "Петров", 20)
    student.married = true
    val employee = Employee("Сергей", "Сальцев", 28, 4)
    employee.married = true
    val employee1 = Employee("Егор", "Лунин", 30)
    employee1.married = false

    println(student.infoArmy())
    println(employee.infoArmy())
    println(employee1.infoArmy())
    println("3 ---------------------------------------------------------------------------")
    val sc = Scanner(System.`in`)
    println("Введите размер в метрах")
    val size = sc.nextInt()
    println(
        "Введите новую единицу измерения:\n" +
                " 1 — дециметр,\n" +
                " 2 — километр,\n" +
                " 3 — метр,\n" +
                " 4 — миллиметр,\n" +
                " 5 — сантиметр"
    )
    val measure = sc.nextInt()

    println(
        when (measure) {
            1 -> "${size * 10.0} дм"
            2 -> "${size / 1000.0} км"
            3 -> "${size} м"
            4 -> "${size * 1000} мм"
            5 -> "${size * 100} см"
            else -> "Неправильное число"
        }
    )
}

abstract class Shop(val town: String,val branch: String) {

    abstract fun getReceipts(earns: Double)
    abstract fun addEmployees(employee: Int)
    open fun info(): String {
        return "город $town филиал $branch"
    }
}

class Magnit(town: String, branch: String) : Shop(town, branch) {
    var capital = 2000000.0
    var employees = 0
    val nds = 0.10
    val kurs = 85.0

    override fun getReceipts(earns: Double) {
        capital += earns * (1 - nds) / kurs
    }

    override fun addEmployees(employee: Int) {
        employees += employee
    }

    override fun info(): String {
        return super.info() + " капитализация $${(capital / kurs).toFloat()}  число работников $employees"
    }
}

class Pyaterochka(town: String, branch: String) : Shop(town, branch) {
    var capital = 100000.0
    var employees = 5
    val nds = 0.20
    override fun getReceipts(earns: Double) {
        capital += earns * (1 - nds)
    }

    override fun addEmployees(employee: Int) {
        employees += employee
    }

    override fun info(): String {
        return super.info() + " капитализация  $capital руб.  число работников $employees"
    }
}
abstract class Person(val name: String, val lastName: String, val age: Int) {
    var married: Boolean = false
    abstract fun canToArmy(): String
    abstract fun isMarried(): Boolean
    open fun infoArmy() = "к призыву в армию "
}

class Student(name: String, lastName: String, age: Int) : Person(name, lastName, age) {

    override fun canToArmy(): String {
        return if (age > 22 && !isMarried()) {
            " годен"
        } else {
            "  не годен"
        }
    }

    override fun isMarried(): Boolean {
        return married
    }

    override fun infoArmy() = name + " " + lastName + " " + super.infoArmy() + canToArmy()
}

class Employee(name: String, lastName: String, age: Int, val childs:Int = 0 ) : Person(name, lastName, age) {

    override fun canToArmy(): String {
        return if (age > 18 && age < 60 && (!isMarried() || (childs < 3))) {
            "  не годен"
        } else {
            " годен"
        }
    }

    override fun isMarried(): Boolean {
        return married
    }

    override fun infoArmy() = name + " " + lastName + " " + super.infoArmy() + canToArmy()
}
