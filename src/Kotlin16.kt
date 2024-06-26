fun main() {
    println("1 ---------------------------------------------------------------------")
    val dog = Dog(21.0, "Барбос")
    val cat = Cat(10.0, "Мурка")
    dog.eat(3.1)
    cat.eat(1.4)
    println("${dog.name} весит ${dog.newWeight()} и говорит ${dog.waul()}")
    println("${cat.name} весит ${cat.newWeight()} и говорит ${cat.waul()}")
    println("2 ---------------------------------------------------------------------------")
    val nokia = Nokia("Nokia Corporation", "5800 XpressMusic", "Finland")
    val sony = Sony("Sony Group Corporation", "Ericsson Xperia X1", "Japan")
    nokia.display = 6
    sony.display = 7
    nokia.ringtone = Melody.Lollipop
    sony.ringtone = Melody.Candy
    println("Мобильное устройство ${nokia.model} фирмы ${nokia.brandName} произведено в ${nokia.madeIn}")
    println("дисплей ${nokia.display} камера ${nokia.camera} Mpx мелодия ${nokia.bell()}")
    println("Мобильное устройство ${sony.model} фирмы ${sony.brandName} произведено в ${sony.madeIn}")
    println("дисплей ${sony.display} камера ${sony.camera} Mpx мелодия ${sony.bell()}")
    println("3 ---------------------------------------------------------------------------")
    val testArray = arrayOf(3, 67, 1, 55, 65, 89, 23)
    for (i in testArray.indices) {
        if (testArray[i] % 5 != 0)
            print("${testArray[i]} ")
    }
}

open class Animal(weight: Double, name: String) {
    var weight = weight
    val name = name

    fun eat(food: Double) {
        weight += food
    }

    fun newWeight(): Double {
        return weight
    }
}

class Dog(weight: Double, name: String) : Animal(weight, name) {
    val sound: String = "гав-гав"
    fun waul(): String {
        return sound
    }
}

class Cat(weight: Double, name: String) : Animal(weight, name) {
    val sound: String = "мяу"
    fun waul(): String {
        return sound
    }
}

open class Smartphone(brandName: String) {
    val brandName = brandName
    var display: Int = 0
    lateinit var ringtone: Melody
    fun bell(): String {
        return ringtone.melody
    }
}

open class Iphone(brandName: String, model: String) : Smartphone(brandName) {
    val model = model
    var camera = 10   //Mpx
}

class Nokia(brandName: String, model: String, madeIn: String) : Iphone(brandName, model) {
    val madeIn = madeIn
}

class Sony(brandName: String, model: String, madeIn: String) : Iphone(brandName, model) {
    val madeIn = madeIn
}

enum class Melody(val melody: String) {
    Candy("там-тара-пам-пам"),
    Lollipop("там-тара-рам-пам")
}