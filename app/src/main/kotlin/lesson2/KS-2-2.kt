package lesson2

fun main () {
val intern = 50
    val internsSalary = 30000
    val employees = 30
    val employeesSalary = 20000
    val expensesOnPermanentEmployees = intern * internsSalary
    val expensesOfEmployeesAndInterns = (employees * employeesSalary) + expensesOnPermanentEmployees
    val averageSalaryOfEmployeeAfterIntern = (expensesOfEmployeesAndInterns) / (intern + employees)
    println(averageSalaryOfEmployeeAfterIntern)
}
