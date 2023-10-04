fun main(args: Array<String>) {
    val shopping = listOf("Tea", "Eggs", "Milk")
    if (shopping.size > 0) println(shopping[0]) // prints "Tea"
    // loopin through a list
    for (item in shopping) println(item)
    //check if list contains something
    if (shopping.contains("Milk")) println(shopping.indexOf("Milk")) // prints 2

    // Mutable list
    val mShopping = mutableListOf("Tea", "Eggs")
    // add a new value

}