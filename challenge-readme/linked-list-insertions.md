## Linked List Insertions
Write three new insertion methods for the LinkedList Class to append a new node to the end of the linked list, to insert before a specified node in the linked list, and to insert after a specified node in the linked list.

### Links
* [LinkedList.java](../code401challenges/src/main/java/linkedList/LinkedList.java) 
* [Node.java](../code401challenges/src/main/java/linkedList/Node.java)
* [LinkedListTest.java](../code401challenges/src/test/java/linkedList/LinkedListTest.java)

### Challenge
* Write a method called `append` which takes in a value to be added and insert it at the end of a linked list
* Write a method called `insertBefore` which takes in a value to be added and inserts it before a specified value within a linked list
* Write a method called `insertAfter` which takes in a value to be added and inserts it after a specified value within a linked list

### Approach and Efficiency
* The three methods will all take on similar structures for this challenge. They will all utilize a while loop to iterate over the linked list until a specified stopping point. The `append` method will stop when `current.getNext() == null`, the `insertBefore` method will stop when the `current.getNext() == valueToInsertBefore`, and the `insertAfter` method will stop when the `current == valueToInsertAfter`. They will all create a new instance of the `Node<T>` class and will reassign pointers where necessary to ensure the list maintains integrity.
* Time and Space Efficiency
  * `append(T value)`
    * Time: O(n)
    * Space: O(1)
  * `insertBefore(T value, T newValue)`
    * Time: O(n)
    * Space: O(1)
  * `insertAfter(T value, T newValue)`
    * Time: O(n)
    * Space: O(1)

### Collaboration
* Travis Cox

### Solution
#### .append()
![append](../assets/linked-list-append.jpg)

#### .insertBefore()
![insert before](../assets/linked-list-insertbefore.jpg)

#### .insertAfter()
![insert after](../assets/linked-list-insertafter.jpg)
