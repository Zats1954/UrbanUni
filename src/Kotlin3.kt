import java.util.*

fun main() {
// 1 --------------------------------------------------------------
    val sc = Scanner(System.`in`)
     println("1. Введите целое число")
    val num = sc.nextInt()
    if (num < 0) {
         println("Результат $num")
    } else {
         println("Результат ${num + 1}")
    }
// 2 -------------------------------------------------------------
    val list: List<Int> = Arrays.asList(4, 45, -2, 8)
    var count = 0
    list.forEach { count += if (it > 0) 1 else 0 }
     println("2. число положительных чисел в заданном наборе $count")

// 3 -----------------------------------------------------------------
     println(" Введите два числа")
    val a = sc.nextDouble()
    val b = sc.nextDouble()
     println("3. Наибольшее из $a и $b")
     println(if (a < b) b else a)
// 4 ----------------------------------------------------------------------
     println(" Введите порядковый номер дня недели (1 — понедельник)")
    val dayNumber = sc.nextInt()
//    val days = Array<String>(7){"понедельник";"вторник";"среда";"четверг";
//        "пятница";"суббота";"воскресение"}
//    if(dayNumber in 1 .. 7 ){
//         println(days[dayNumber - 1])
//    } else { println(" Неправильный номер")}
    if (dayNumber == 1) { println("понедельник")
    } else if (dayNumber == 2) { println("вторник")
    } else if (dayNumber == 3) { println("среда")
    } else if (dayNumber == 4) { println("четверг")
    } else if (dayNumber == 5) { println("пятница")
    } else if (dayNumber == 6) { println("суббота")
    } else if (dayNumber == 7) { println("воскресение")
    } else { println(" Неправильный номер")
    }
// 5 ----------------------------------------------------------------------
     println("5. Введите оценку (1 —  5)")
    val mark = sc.nextInt()
    if (mark == 1) { println("плохо")
    } else if (mark == 2) { println("неудовлетворительно")
    } else if (mark == 3) { println("удовлетворительно")
    } else if (mark == 4) { println("хорошо")
    } else if (mark == 5) { println("отлично")
    } else { println(" Неправильная оценка")
    }
// 6 ----------------------------------------------------------------------
     println("6. Введите номер операции (1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление)")
    val operation = sc.nextInt()
    if (operation !in 1..4) { println(" Неправильный номер операции");
                             System.exit(0)
    }
     println(" Введите первое число  ")
    val c = sc.nextDouble()
     println(" Введите второе число (не равное 0) ")
    val d = sc.nextDouble()
    if(d == 0.0){ println(" Неправильное число");
        System.exit(0)}
    if (operation == 1) { println(c + d)
    } else if (operation == 2) { println(c - d)
    } else if (operation == 3) { println(c * d)
    } else if (operation == 4) { println(c / d)
    } else { println(" Как сюда попало?")
    }
}

