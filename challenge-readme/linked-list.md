## Singly Linked List

### Challenge
Create a singly linked list with an insert, includes, and toString method. Additionally, create a Node class which creates a new node with a value and a pointer to the next item within the linked list.

### Resources
* Jack Kinne
* Matt Stuhring
* Melfi Perez
* Travis Cox
* [Linked Lists](https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html)

### Files
* src/main/linkedList
  * [LinkedList.java](../code401challenges/src/main/java/linkedList/LinkedList.java)
  * [Node.java](../code401challenges/src/main/java/linkedList/Node.java)
* src/test/linkedList
  * [Link to the Tests](../code401challenges/src/test/java/linkedList/LinkedListTest.java)

### Approach and Efficiency
* Approach: Create a test driven Class which follows best practices and has optimized time and space.
* Time and Space:
  * setHead() : O(1) | O(1)
  * insert() : O(1) | O(1)
  * includes() : O(n) | O(1)
  * toString() : O(n) | O(1)

### API
* LinkedList<T>
  * Variables:
    * head: the first node of the linked list
  * Methods:
    * setHead(T item) :
      * Takes in an item (value) and assigns it to the head with a next pointer of null
    * insert(T item) :
      * Performs an insert before call which takes in an item (value), creates a temp val of the current head, reassigns a new node to head using the item as the val and the temp as the next
    * includes(T valueToCheck) :
      * Assigns the current value to the head and loops through the linked list while the current is not equal to the value being checked. Returns true if the value to be checked is in the linked list; returns false if the value to be checked is not in the linked list.
    * toString() :
      * Uses the StringBuilder class to create a response variable which builds and holds the values of the linked list to be printed.
* Node<T>
  * Variables:
    * data: the value of the node
    * next: pointer to the next item in the linked list, null if the last item of the list
