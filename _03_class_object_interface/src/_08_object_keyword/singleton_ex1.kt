package _08_object_keyword

object Payroll {
    val allEmployees = arrayListOf<Worker>()

    fun calculateSalary() {
        var totalSalary = 0
        for (employee in allEmployees) {
            totalSalary += employee.salary
        }
        println("이번달에 지불할 임금은 ${totalSalary}원 입니다.")
    }
}

class Worker(
    val name: String,
    val salary: Int
)

fun main() {
    Payroll.allEmployees.addAll(
        listOf(
            Worker("WorkerA", 100000),
            Worker("WorkerB", 150000),
            Worker("WorkerC", 200000),
            Worker("WorkerD", 250000),
            Worker("WorkerE", 300000),
        )
    )
    Payroll.calculateSalary()
}