## Linked List Insertions
Write a method which takes in a value as a parameter and returns the value that is the at that distance from the end of the linked list. 

Example: 1 -> 2 -> 3 -> 4 -> null ; value 1 from end ; return 3 


### Links
* [LinkedList.java](../code401challenges/src/main/java/linkedList/LinkedList.java) 
* [Node.java](../code401challenges/src/main/java/linkedList/Node.java)
* [LinkedListTest.java](../code401challenges/src/test/java/linkedList/LinkedListTest.java)

### Challenge
* Write a method called `kthFromEnd` which takes in a value that represents how far back from the end of the linked list to find. It then returns the value at that distance from the end - the last linked list item is considered to be `index = 0`

### Approach and Efficiency
* The method `kthFromEnd(int value)` will use a `int lenCount` to store the length of linked list, use a `current` to get the current value and a `while` loop to iterate one time over the linked list. This loop will increment the lenCount to get the length of the list. After the completion of the while loop we will reset `current = this.head` and then we will use a `for` loop to iterate over the list by it's length. A conditional check will be used to see if `incrementer = lenCount - value` - if so, return `current` - if not, set `current = current.getNext()`. If this loop does not produce the correct result, `throw new IndexOutOfBoundsException()`.
* Time and Space Efficiency
  * `kthFromEnd(int value)`
    * Time: O(n)
    * Space: O(1)

### Collaboration
* Renee Messick

### Solution
![append](../assets/linked-list-kth-value.jpg)
