## Stacks and Queues

### Challenge
Create a class `Stack` with an empty value assigned to `top` and define a method for `push`, `pop`, and `peek`.

Create a class `Queue` with an empty value assigned to `front` and `back` and define a method for `enqueue`, `dequeue`, `peek`.

### Resources
* Melfi Perez
* Matt Stuhring
* Renee Messick
* Travis Cox

### Files
* src/main/stacksAndQueues
  * [Node.java](../code401challenges/src/main/java/stacksAndQueues/Node.java)
  * [Stack.java](../code401challenges/src/main/java/stacksAndQueues/Stack.java)
  * [Queue.java](../code401challenges/src/main/java/stacksAndQueues/Queue.java)
* src/test/stacksAndQueues
  * [NodeTest.java](../code401challenges/src/test/java/stacksAndQueues/NodeTest.java)
  * [StackTest.java](../code401challenges/src/test/java/stacksAndQueues/StackTest.java)
  * [QueueTest.java](../code401challenges/src/test/java/stacksAndQueues/QueueTest.java)

### Approach and Efficiency
* Approach: Create a test driven Class which follows best practices and has optimized time and space.
* Time and Space:
  * Stack:
    * `push(T value)`
      * T: O(1)
      * S: O(1)
    * `pop()`
      * T: O(1)
      * S: O(1)
    * `peek()`
      * T: O(1)
      * S: O(1)
    * `toString()`
      * T: O(n)
      * S: O(1)
    * `setToString()`
      * T: O(n)
      * S: O(1)
  * Queue:
    * `enqueue(T value)`
      * T: O(1)
      * S: O(1)
    * `dequeue()`
      * T: O(1)
      * S: O(1)
    * `peek()`
      * T: O(1)
      * S: O(1)
    * `toString()`
      * T: O(n)
      * S: O(1)
    * `setToString()`
      * T: O(n)
      * S: O(1)


### API
* **Node<T>**
  * Variable:
    * `T value`
    * `Node<T> next`
  * Methods:
    * `public void setValue(T value)`
      * sets the value of the node.
    * `public T getValue()`
      * returns the value of the node.
    * `public void setNext(Node<T> node)`
      * sets the next of the node.
    * `public Node<T> getNext()`
      * returns the node's next node.
    * `public String toString()`
      * returns a string of the node's value.

* **Stack<T>**
  * Variables:
    * `Node<T> top`
  * Methods:
    * `push(T value)`
      * adds a new node to the top of the stack and reassigns the next value to the previous top.
    * `pop()`
      * removes the node from the top of the stack and reassigns the top to the next node.
      * returns the value of the node being removed from the stack.
    * `peek()`
      * returns the value of the node from the top of the stack and does nothing else to it.
    * `public String toString()`
      * returns `setToString(this.top)`.
    * `private String setToString(Node<T> node)`
      * performs a recursive call on node and prints a string version of the values at each node from the top of the stack to the bottom.

* **Queue<T>**
  * Variables:
    * `Node<T> front`
    * `Node<T> back`
  * Methods:
    * `enqueue(T value)`
      * adds a new node to the back of the queue.
    * `dequeue()`
      * removes the node from the front of the queue and reassigns the front to the previous fronts next.
      * returns the value of the node being removed from the front of the queue.
    * `peek()`
      * returns the value from the front of the queue and does nothing else to it.
    * `public String toString()`
      * returns `setToString(this.top)`.
    * `private String setToString(Node<T> node)`
      * performs a recursive call on node and prints a string version of the values at each node from the front of the queue to the back.
