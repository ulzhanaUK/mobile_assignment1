fun main(args: Array<String>) {
  //Variables and Data Types:
    var salary: Int = 600000
    val weight: Double = 55.9
    val city: String = "Astana"
    val isSunny: Boolean = true

    println("Salary: $salary")
    println("Weight: $weight")
    println("City: $city")
    println("Is sunny: $isSunny")

  //Conditional Statements:
    println("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: 0

    if (number > 0) {
        println("Positive")
    } else if (number < 0) {
        println("Negative")
    } else {
        println("Zero")
    }

  //Loops:
    println("For loop:")
    for (i in 1..10) {
        println(i)
    }

    println("While loop:")
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

  //Collections:
    val numbers = listOf(100, 85, 91, 100)
    var sum = 0
    
    for (num in numbers) {
        sum += num
    }
    println("Sum = $sum")
}