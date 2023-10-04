* Arrays
  * Make an array: 
    * var array = arrayOf(1, 3, 2)
  * Make an array initialized with nulls: 
    * var nullArray: Array<Strings?> = arrayOfNulls(2)
  * Size of an array: 
    * var size = array.size 
    * //3
  * reverse the order of the items:
    * array.reverse() 
    * // (2,3,1)
  * find out if it contains something:
    * val isIn = array.contains(1) 
    * // true
  * calculate the sum of its items:
    * val sum = array.sum()
    * // 2+3+1 = 6
  * get average:
    * val average = array.average() 
    * // returns a double -> (2+3+1)/3 = 2.0
  * get the min:
    * array.min() 
    * // 1
  * get the max:
    * array.max()
    * // 3
  * Sort the array in a natural order (numbers, strings, chars, booleans)
    * array.sort()
    * // (1,2,3).

* Lists 
  * used when sequence matters
  * ordered list like a shopping cart
  * allows duplicate values
  * a list is immutable, we can't update any of the references it stores
* Mutable list
  * is a subtype of list so it can do basically the same thing
  * only difference is that it can have extra functions to add or remove values, or update or rearrange existing ones
  * add a new vallue by using add() functions
* Set
  * used when uniqueness matters
  * doesn't allow duplicates,
  * doesn't care about order
* Maps
  * used with key/value pairs
  * no duplicate keys
  * allows duplicate values

NOTES:

* Create an array initialized with null values using the arrayOfNulls()
* Useful array functions include: sort, reverse, contains, min, max, sum, average
* The kotlin Standard library contains pre-built classes and functions grouped into packages
* A List is a collection that knows and cares about index position. It can contain duplicate values
* A set is an unordered collection that doesn't allow duplicates
* A map is a collection that uses key/value pairs. It can contain duplicate values, but not duplicate keys.
* List, Set, Map are immutable by default. 
* MutableList, MutableSet, MutableMap are mutable subtypes of these collections
* Create a list using listOf()
* Create a Mutable list using mutableListOf()
* Create a set using setOf()
* Create a MutableSet using mutableSetOf()
* A set checks for duplicates by first looking for matching hash code values. It then uses === and == operators to check for referential or object equality
* Create a map using mapOf(), passing key/value pairs
* Create a MutableMap using MutableMapOf()