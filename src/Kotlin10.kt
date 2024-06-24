import java.lang.Math.pow

fun main() {
    val a = 12
    val n = 3.0
    val b = 30
 power(a.toDouble(),n)
 multiDigits(a,b)
 nod(a,b)
}

fun power(a:Double, n:Double){
    println("$a  в степени $n -> ${pow(a,n)}")
}

fun multiDigits(a: Int, b: Int){
    var multi = 1
    for(i in a..b){
        multi *= i
    }
    println("произведение чисел от $a до $b равно $multi")
}

fun nod(a: Int, b: Int) {
    var result = 1
    val maxDigit = if(a < b) b else a
    for(i in 1 .. maxDigit){
        if((a % i == 0) && (b % i == 0)){
            result = i
        }
    }
    println("наибольший общий делитель $a и $b -> $result ")
}