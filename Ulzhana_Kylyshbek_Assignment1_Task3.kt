// Basic function:
fun sum(a: Int, b: Int): Int {
    return a + b
}
//Lambda Functions:
val multiply: (Int, Int) -> Int = { a, b -> a * b }
//Higher-Order Functions:
fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val result = sum(100, 94)
    println("$result")
    
    val result2 = multiply(4, 12)
    println("$result2")
    
    //Using Higher-Order Functions:
    val result_2 = applyOperation(100, 94) { x, y -> x + y }
    println("$result_2")
    
    val result2_2 = applyOperation(4, 12, multiply)
    println("$result2_2") 
}

