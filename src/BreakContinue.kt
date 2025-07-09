fun main()
{
    //break - jumps out of a loop

    var i = 0
    while(i < 10)
    {
        println(i)
        i++
        if(i == 7)
        { break } // will print until 6 and stop the loop
    }
    println("---------")
    //continue - skips a specified iteration and heads over to the next
     var a = 0
    while(a < 12)
    {
        if(a == 2)
        {
            a++
            continue
        }

        println(a)
        a++


    }
}