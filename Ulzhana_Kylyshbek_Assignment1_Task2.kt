//Create a Person class:
open class Person(val name: String, val age: Int, val email: String) {
    open fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Email: $email")
    }
}
//Inheritance:
class Employee(name: String, age: Int, email: String, val salary: Double) : Person(name, age, email) {
    override fun displayInfo() {
        super.displayInfo()  
        println("Salary: $$salary")
    }
}
//Encapsulation:
class BankAccount(private var balance: Double) {
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Inserted: $$amount. Current balance: $$balance")
        } else {
            println("Error!")
        }
    }
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew: $$amount. Current balance: $$balance")
        } else {
            println("Error!")
        }
    }
}

fun main() {
    val person = Person("Biba", 23, "b_saugabayeva@kbtu.kz")
    person.displayInfo()
    val employee = Employee("Ulzhana", 24, "u_kylyshbek@kbtu.kz", 50000.0)
    employee.displayInfo()
    val bankAccount = BankAccount(1000.0)
    bankAccount.deposit(200.0)
    bankAccount.withdraw(500.0)
    bankAccount.withdraw(800.0)  
}