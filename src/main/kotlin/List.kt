fun main(args: Array<String>) {
    // Lists
    val shopping = listOf("Tea", "Eggs", "Milk")
    if (shopping.size > 0) println(shopping[0]) // prints "Tea"
    // looping through a list
    for (item in shopping) println(item)
    //check if list contains something
    if (shopping.contains("Milk")) println(shopping.indexOf("Milk")) // prints 2


    // Mutable list
    val mShopping = mutableListOf("Tea", "Eggs")
    println("original mutable shopping list: $mShopping")
    // add a new value (to the end of the list)
    mShopping.add("Milk")
    // add a new value at a specific index
    mShopping.add(1, "Milk")
    // remove values
    if(mShopping.contains("Milk")) mShopping.remove("Milk")
    // removeAt to remove a value at given index
    if (mShopping.size > 1) mShopping.removeAt(1)
    // replace one value with another
    if (mShopping.size > 0) mShopping.set(0, "Coffe") // replaces tea with coffee
    // change the order and sort
    mShopping.sort()
    // reverse the list
    mShopping.reverse()
    // randomize the list
    mShopping.shuffle()
    // addAll to add all the items that are held in another collection
    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)
    // remove all
    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)
    // to hold all items that are held in another collection and removes everything else
    val toRetain = listOf("Milk", "Sugar")
    mShopping.retainAll(toRetain)
    // to remove and clear everything in the list, you can use the clear function
    mShopping.clear()
    // make a copy of a list
    val shoppingCopy = mShopping.toList()

}