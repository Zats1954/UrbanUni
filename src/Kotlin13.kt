fun main() {
   val helicopter = Helicopter("Alligator", 10800, 300, 4000)
    println("Спроектировали вертолет с названием ${helicopter.name} " +
            "скоростью полета ${helicopter.speed}км/час весом ${helicopter.weight} кг " +
            "высотой полета ${helicopter.maxHeight} м")

    val pet = Pet("Зорька", 420, Type.COW)
    println("Домашнее животное: " + pet.type.value  +
            " Кличка: " + pet.name + " Вес: " + pet.weight)

    val  number = 5.47
    var ceil =  number.toInt()
    if((number - ceil) >= 0.5) {
        ceil++
    }
    println("$number $ceil")
}

data class Helicopter(
    val name: String,
    val weight: Int,
    val speed: Int,
    val maxHeight: Int
)

data class Pet(
    val name: String,
    val weight: Int,
    val type: Type,
 )

enum class Type(val value: String){ COW ("корова"),
                 GOOSE ("гусь"),
                 DOG ("собака"),
                 CAT ("кошка"),
                 UN ("чудо-юдо")
}