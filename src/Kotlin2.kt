fun main(){
    val a = 5
    var P = 4*a
    var S = a*a
    println("a = $a :  P = $P; S = $S")

    val b = 6
    P = 2*(a + b)
    S = a*b
    println("a = $a, b = $b :  P = $P; S = $S")

    val d = 65
    val L = Math.PI * d
    println("d = $d :  L = $L cm (${(L/100).toInt()} m)")

    val A = 100
    val B = 33
    println("A = $A, B = $B; max B in A ${A/B}")
}