import java.util.*

fun main() {
    println("1 ---------------------------------------------------------------------------")
    println("Введите e-mail")
    val email = readLine() ?: ""
    println("Введите пароль (не менее 6 символов!)")
    val password = readLine() ?: ""
    val registration = Registration(email)
    registration.setPassword(password)
    println("e-mail ${registration.getEmail()}  password  ${registration.getPassword()}")
    println("2 ---------------------------------------------------------------------------")
    val testArray = arrayOf(
        arrayOf(1, 2, 3, 4, 5, 6),
        arrayOf(11, 13, 15, 14, 18, 19),
        arrayOf(8, 6, 5, 7)
    )
    println(findOdds(testArray).contentDeepToString())
    println("3 ---------------------------------------------------------------------------")
    val array1 = Array<Array<Int>>(4) {
        Array(4) { 0 };
        Array(4) { 0 };
        Array(4) { 0 };
        Array(4) { 0 }
    }
    println(fillArray(array1).contentDeepToString())
    println("4 ---------------------------------------------------------------------------")
    val array2 = arrayOf(1, 2, 3, 4, -5, 6, 11, -13, 15, 14, -18, 19, -8, 6, 5, 7)
    arrayPositive(array2)
}

class Registration(email: String) {
    private val email = email
    private var password: String = ""

    fun getEmail(): String {
        return email.uppercase(Locale.getDefault())
    }

    fun getPassword(): String {
        return this.password
    }

    fun setPassword(password: String) {
        if (password.length < 6) {
            println("длина пароля менее 6 символов!")
            System.exit(0)
        } else {
            this.password = password
        }
    }
}

fun findOdds(inArray: Array<Array<Int>>): Array<Int> {
    val dimRows = inArray.size
    val dimColumns = inArray[0].size
    var resultArray = arrayListOf<Int>()
    var number = 0
    for (i in inArray.indices) {
        for (j in inArray[i].indices) {
            if (inArray[i][j] % 2 == 0) {
                resultArray.add(inArray[i][j])
                number++
            }
        }
    }
    return resultArray.toTypedArray()
}

private fun fillArray(array: Array<Array<Int>>): Array<Array<Int>> {
    var number = 1
    for (i in array.indices) {
        for (j in array[i].indices) {
            array[i][j] = number++
        }
    }
    return array
}

fun arrayPositive(array: Array<Int>) {
    for (i in array.indices) {
        if (positive(array[i])) {
            print("${array[i]} ")
        }
    }
}

fun positive(k: Int): Boolean {
    return k > 0
}
