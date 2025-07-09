fun main ()
{
    /*To make an array use the "arrayOf" function*/
    // below is an array

    //string can be an array of characters
    var myString = "BLAH BLAH BLAH"
    println(myString[3]) // outputs H

    //array of numbers
    var intArray = arrayOf(4,5,2,3,46,9,2,45,1)

    // to change an element, specify the index of it
    intArray[0] = 6

    //finding the array size using ".size" function
    println(intArray.size)

    //looping through array elements using a for loop
    for (ints in intArray)
    {
        println(ints)
    }

    //checking if an element exists in an array using an if loop
    if (46 in intArray)
    {
        println("Exists")
    }else
    {
        println("Does not exist")
    }


}