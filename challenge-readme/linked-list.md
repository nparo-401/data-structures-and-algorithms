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
  * [LinkedListTest.java](../code401challenges/src/test/java/linkedList/LinkedListTest.java)

### Approach and Efficiency
* Approach: Create a test driven Class which follows best practices and has optimized time and space.
* Time and Space:
  * `setHead()` 
    * Time: O(1) 
    * Space: O(1)
  * `insert()`
    * Time: O(1) 
    * Space: O(1)
  * `includes()` 
    * Time: O(n)
    * Space: O(1)
  * `append()`
    * Time: O(n)
    * Space: O(1)
  * `insertBefore()`
    * Time: O(n)
    * Space: O(1)
  * `insertAfter()`
    * Time: O(n)
    * Space: O(1)
  * `toString()`
    * Time: O(1) 
    * Space: O(1)
  * `setToString()`
    * Time: O(1) 
    * Space: O(1)

### API
* LinkedList<T>
  * Variables:
    * `head` 
      * the first node of the linked list
  * Methods:
    * `setHead(T value)`
      * Takes in an value and assigns it to the head with a next pointer of null
    * `getHead()`
      * returns the head
    * `prepend(T value)`
      * Performs an insert before call which takes in an value, creates a temp val of the current head, reassigns a new node to head using the value as the val and the temp as the next
    * `includes(T valueToCheck)`
      * Assigns the current value to the head and loops through the linked list while the current is not equal to the value being checked. Returns true if the value to be checked is in the linked list; returns false if the value to be checked is not in the linked list.
    * `append(T value)`
      * Assigns `value` to a new node as the last element in the linked list
    * `insertBefore(T value, T valueToBeAdded)`
      * Assigns `value` before the node at `valueToBeAdded`
    * `insertAfter(T value, T valueToBeAdded)`
      * Assigns `value` after the node at `valueToBeAdded`
    * `toString()`
      * returns `setToString(this.head)`
    * `setToString(Node<?> node)`
      * checks if `node == null` and returns "null"
      * returns a string of `node.getValue() + " " + setToString(node.getNext())`
* Node<T>
  * Variables:
    * `value`
      * the value of the node
    * `next`
      * pointer to the next item in the linked list, null if the last item of the list
    * `previous`
      * pointer to the previous item in the linked list, null if the node is the head
  * Methods:
    * `getValue()`
      * returns the value of the current node
    * `setNext()`
      * sets a pointer to the next value of the linked list
    * `getNext()`
      * returns the next value of the linked list
    * `setPrevious()`
      * sets a pointer to the previous value of the linked list
    * `getPrevious()`
      * returns the previous value of the linked list
