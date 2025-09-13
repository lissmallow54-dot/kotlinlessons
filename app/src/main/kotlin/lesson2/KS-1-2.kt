package lesson2
const val NUMBER_OF_GRADES = 4f
fun main () {
    val a: Byte = 3
    val b: Byte = 4
    val c: Byte = 3
    val d: Byte = 5
    val average = (a + b + c + d) / NUMBER_OF_GRADES
    //
println(String.format("%.2f", average))
}