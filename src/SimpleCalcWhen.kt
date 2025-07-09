fun main ()
{
    var num1 = 5
    var num2 = 3


    println("Enter Operation (+, -, /, *)")
    var operation = readln()

    var resulting = when(operation)
    {
        "+" ->  (num1 + num2).toFloat()
        "-" ->  (num1 - num2).toFloat()
        "/" ->  if(num2 != 0) {
            (num1 / num2).toFloat()
        } else {
            println("error in division by zero")
        }
        "*" ->  (num1 * num2).toFloat()
        else -> "Invalid operation"
    }

    println(resulting)
}