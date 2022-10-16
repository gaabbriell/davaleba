fun main() {

    val point1 = Point(1, 2)
    val point2 = Point(3, 4)

    val fraction = Fraction(3, 9,1, 6)


    println(point1.toString())
    println(point2.toString())
    println(point1.equals(point2))
    println(point1.symmetric())
    println(point2.symmetric())

    println(fraction.trimFraction())
    println(fraction.subtraction())
    println(fraction.multiply())



}

data class Point(val x: Int, val y: Int){

    fun symmetric(): String {
        val symmetricX = -x
        val symmetricY = -y

        return "($symmetricX; $symmetricY)"
    }
}


class Fraction(val numerator1: Int, val denominator1: Int, val numerator2: Int, val denominator2: Int) {



    //shekveca rogoraa inglisurad idk ;dddd

    fun trimFraction() {

        var i = 1
        var trimmedfraction = 1
        while (numerator1 >= i && denominator1 >= i) {
            if (numerator1 % i == 0 && denominator1 % i == 0)
                trimmedfraction = i
            ++i
        }

        val trimmedNumerator = numerator1 / trimmedfraction
        val trimmedDenominator = denominator1 / trimmedfraction
        println("TrimmedFraction:$trimmedNumerator/$trimmedDenominator")

    }
    fun subtraction(){
// tu mnishvnelebi tolia:
        val finalNumerator = numerator1 - numerator2
// tu mnishvnelebi gansxvavebulebi aqvt:
        val finalNumerator2 = (numerator1*denominator2) - (numerator2*denominator1)
        val finalDenominator2 = denominator1*denominator2

        if (denominator1 == denominator2){
            println("Subtraction: $finalNumerator / $denominator1")
        } else{
            println("Subtraction: $finalNumerator2 / $finalDenominator2")
        }


    }
    fun multiply(){
        val multipliedNumerator = numerator1*numerator2
        val multipliedDenominator = denominator1*denominator2
        println("Multiplication: $multipliedNumerator / $multipliedDenominator")
    }


}


























