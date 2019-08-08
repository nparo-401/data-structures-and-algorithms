## Binary Search
Write a method to perform binary search on an array of integers.

[Link to the Code](../code401challenges/src/main/java/code401challenges/BinarySearch.java)

[Link to the Tests](../code401challenges/src/test/java/code401challenges/BinarySearchTest.java)

### Challenge
This challenge is to create a method which takes in a sorted integer array and a item to search for. This method will use a binary search to iterate through the array and then return the index the item searched for is located within the array. This challenge is to be completed without using any of the built-in
methods.

### Approach and Efficiency
For this challenge we approaching this method with the following steps:
* First: initialize `int begin = 0` and `int end = arr.length - 1`
* Second: enter a while loop with a condition of `begin < end`
  * assign the `int mid = (begin + end) / 2`
  * check if arr[mid] is equal to search key
    * return mid if true
  * check if arr[mid] is less than search key
    * reassign `begin = mid + 1`
    * loop through again
  * check if arr[mid] is greater than search key
    * reassign `end = mid - 1`
    * loop through again
* Third: if the while loop ends before return happens then `return -1` - this will handle cases where the search key is not in the array and if the array length is 0

### Collaboration
* Padmapriya Ganapathi

### Solution
![Binary Search](../assets/binary-search.jpg)