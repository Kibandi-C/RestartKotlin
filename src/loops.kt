import kotlin.concurrent.timer

fun main ()
{
    // COVERING THE TYPES OF LOOPS IN Kotlin

    //if else

    var TimeOfDay = 12

    if(TimeOfDay < 12)
    {
        println("GOOD DAY")
    } else
    {
        println("GOOD EVENING")
    }

    // IF ELSE-IF
    var raceTimerSec = 11

    if(raceTimerSec < 10)
    {
        println("Very Fast")
    } else if(raceTimerSec == 10)
    {
        println("Speedy")
    } else
    {
        println("Moderately slow")
    }

    //SHORT FORM IF
    var weight = 50
    var bodyBMI = if (weight < 50) "Under weight" else "Over weight"
    println(bodyBMI)

    //WHEN LOOP remember switch case in other languages
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

    //for loop - mainly used in arrays

    var cars = arrayOf("Mercedes","BMW","Toyota","Honda","Suzuki")

    for(car in cars)
    {
        println(car) // will output all elements in the cars array
    }

    //ranges in a for loop
     var alphabets = 'a'..'z'
    for(alphabet in alphabets)
    {
        println(alphabet)
    }

    var randomNums = 10..30
    for(randomNum in randomNums)
    {
        println(randomNum)
    }

    //WHILE LOOP (WHILE DO, DO WHILE)

    /*
    var num = 0
    while (num < 5 )
    {
        println(num)
        num ++ 3
    }

    do
    {
        code to be executed
    } while (condition)


    */

}