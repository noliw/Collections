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
    * // (1,2,3)

* Lists 
  * used when sequence matters
  * allows duplicate values
* Set
  * used when uniqueness matters
  * doesn't allow duplicates,
  * doesn't care about order
* Maps
  * used with key/value pairs
  * no duplicate keys
  * allows duplicate values