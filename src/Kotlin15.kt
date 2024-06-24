import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("1 ---------------------------------------------------------------------------")
    val bankCard = BankCard()
    bankCard.cardCode = 1546
    println("Введите номер банковской карты")
    bankCard.cardNumber = sc.nextInt()
    legalCode(bankCard)
    println("Введите пароль банковской карты")
    while (!bankCard.checkPassword(sc.next())) {
        if (bankCard.attempts < 1) {
            println("Попытки ввода пароля исчерпаны")
            break
        }
        println(" осталось ${bankCard.attempts} попыток")
    }
    legalCode(bankCard)
    println("2 ---------------------------------------------------------------------------")
    println("Введите целое число")
    var a = sc.nextInt()
    a += 7
    a -= 4
    a *= 2
    a %= 3
    println("Результат $a ")
    println("3 ---------------------------------------------------------------------------")
    println("Введите двухзначное число")
    var twoDigits = sc.nextInt()
    if (twoDigits in 10..99) {
        println("${twoDigits % 10 * 10 + twoDigits / 10}")
    }
}

private fun legalCode(bankCard: BankCard) {
    if (bankCard.cardCode != 0) {
        println("код карты ${bankCard.cardCode}")
    } else {
        println("код карты недоступен")
    }
}

class BankCard() {
    var attempts = 3
    var check = false
    val PASSWORD = "Urban"
    var cardNumber: Int = 0
        set(value) {
            field = value
        }
        get() = field

    var cardCode: Int = 0
        set(value) {
            field = value
        }
        get() {
            if (check)
                return field
            else
                return 0
        }

    fun checkPassword(password: String): Boolean {
        return if (password == PASSWORD) {
            check = true
            true
        } else {
            attempts--
            false
        }
    }
}
