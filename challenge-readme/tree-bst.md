## Tree and Binary Search Tree

### Challenge
Create a class `Tree` which has `preOrder()`, `inOrder()`, and `postOrder()` traversal methods.

Create a class `BinarySearchTree` which has `add(int value)` and `contains(int value)` methods.

### Resources
* Melfi Perez
* Matt Stuhring
* Renee Messick
* Travis Cox
* Jack Kinne
* [Binary Tree](https://www.baeldung.com/java-binary-tree)
* [Binary Search Tree](https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/)
* [Comparing Generic Types](https://stackoverflow.com/questions/20793082/java-comparing-generic-types)

### Files
* src/main/tree
  * [BinarySearchTree.java](../code401challenges/src/main/java/tree/BinarySearchTree.java)
  * [Node.java](../code401challenges/src/main/java/tree/Node.java)
  * [Tree.java](../code401challenges/src/main/java/tree/Tree.java)
* src/test/tree
  * [TreeTest.java](../code401challenges/src/test/java/tree/TreeTest.java)

### Approach and Efficiency
* Approach: Create a test driven Class which follows best practices and has optimized time and space.
* Time and Space:
  * Tree:
    * `public boolean isEmpty()`
      * T: O(1)
      * S: O(1)
    * `public List<T> preOrder()`
      * T: O(n)
      * S: O(n)
    * `private List<T> preOrder(Node<T> current, List<T> response)`
      * T: O(n)
      * S: O(n)
    * `public List<T> inOrder()`
      * T: O(n)
      * S: O(n)
    * `private List<T> inOrder(Node<T> current, List<T> response)`
      * T: O(n)
      * S: O(n)
    * `public List<T> postOrder()`
      * T: O(n)
      * S: O(n)
    * `private List<T> postOrder(Node<T> current, List<T> response)`
      * T: O(n)
      * S: O(n)
  * BinarySearchTree:
    * `public void add(int value)`
      * T: O(n)
      * S: O(n)
    * `public Node<Integer> add(Node<Integer> current, int value)`
      * T: O(n)
      * S: O(n)
    * `public void contains(int value)`
      * T: O(n)
      * S: O(n)
    * `public Node<Integer> contains(Node<Integer> current, int value)`
      * T: O(n)
      * S: O(n)

### API
* **Node<T>**
  * Variable:
    * `private T value`
    * `private Node<T> left`
    * `private Node<T> right`
  * Constructor:
    * `Node(T value)`
  * Methods:
    * `public void setLeft(Node<T> node)`
    * `public void setRight(Node<T> node)`
    * `public T getValue()`
    * `public Node<T> getLeft()`
    * `public Node<T> getRight()`

* **Tree<T>**
  * Variables:
    * `Node<T> root`
  * Methods:
    * `public boolean isEmpty()`
      * returns if the tree is empty
    * `public List<T> preOrder()`
      * returns the list produced from the private `preOrder` method
    * `private List<T> preOrder(Node<T> current, List<T> response)`
      * recursively adds the tree elements to a response list
      * order: "me - left - right"
    * `public List<T> inOrder()`
      * returns the list produced from the private `inOrder` method
    * `private List<T> inOrder(Node<T> current, List<T> response)`
      * recursively adds the tree elements to a response list
      * order: "left - me - right"
    * `public List<T> postOrder()`
      * returns the list produced form the private `postOrder` method
    * `private List<T> postOrder(Node<T> current, List<T> response)`
      * recursively adds the tree elements to a response list
      * order: "left - right - me"

* **BinarySearchTree extends Tree<Integer>**
  * Constructor:
    * calls `super()` on Tree
  * Methods:
    * `public void add(int value)`
      * recursively calls the private `add` method to build the tree
    * `private Node<Integer> add(Node<Integer> current, int value)`
      * traverses down the levels of the tree by comparing the value to the current node
      * if node is null then return a new node with the value
      * if less than value continue down left branch
        * recursively call add
      * if greater than vlaue continue down right branch
        * recursively call add
      * if equal return current value (no duplicates)
      return the current
    * `public boolean contains(int value)`
      * recursively calls private `contains`
    * `private boolean contains(Node<Integer> current, int value)`
      * checks if current is null and returns false
      * checks if current is the value and returns true
      * final return is a recursive call to either left or right to traverse down proper branch
