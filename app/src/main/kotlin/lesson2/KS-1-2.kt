package lesson2
const val NUMBER_OF_GRADES = 4
fun main () {
    val studentGrade: Byte = 3
    val studentGrade2: Byte = 4
    val studentGrade3: Byte = 3
    val studentGrade4: Byte = 5
    val average = (studentGrade + studentGrade2 + studentGrade3 + studentGrade4).toDouble() / NUMBER_OF_GRADES
    println(String.format("%.2f", average))
}