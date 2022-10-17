fun main(args: Array<String>) {

    //List

    // Example 1

    val stringList= listOf("apple","banana","pineapple")
    println(stringList)

    val stringSet = setOf("1","2","3")
    println(stringSet)

    val number = listOf("one","two","three")
    println("numbers of elements: ${number.size}")
    println("Second element is : ${number.get(1)}")
    println("Third element is : ${number[2]}")
    // tell the what is the index of number two
    println("Index of element two : ${number.indexOf("two")}")


    // just practice in using Collection
    fun printAll (strings:Collection<String>){
        for(s in strings) print("$s")
        println()
    }

    // Example 2
    // mutablelist can add or remove

        val numbers = mutableListOf(1,2,4,5)

        numbers.add(6)
        numbers.removeAt(1)
        // change value by index
        numbers[0]=0

        // shuffle means put the elements in random places
        numbers.shuffle()
        println(numbers)


    //set

    //Example 1

    val leks = setOf(1,2,3,4)
    if(leks.contains(1)) println("1 is in the set")

    val leksBackwards = setOf(4,3,2,1)

    //the positions doesn't count?

    println("These sets are equal : ${leks==leksBackwards}")


    //Set

    //Example 1

    val numberSet = setOf(1,2,3,4)
    val numberSetBackwards= setOf(4,3,2,1)

    //.first() means index
    println(numberSet.first() == numberSetBackwards.first())
    println(numberSet.first() == numberSetBackwards.last())










}



