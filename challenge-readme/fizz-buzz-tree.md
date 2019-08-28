## Fizz Buzz Tree
Create a method which takes in a tree and changes the values of each of the nodes dependent on the current node's value.

### Links
* src/main/utilities
  * [FizzBuzzTree.java](../code401challenges/src/main/java/utilities/FizzBuzzTree.java)
* src/test/utilities
  * [FizzBuzzTreeTest.java](../code401challenges/src/main/java/utilities/FizzBuzzTreeTest.java)

### Challenge
Create a class `FizzBuzzTree` and a method called `fizzBuzzTree(Tree tree)` which changes the value of each node depending on the following conditions:
1. If divisible by 3, replace the value with "Fizz"
2. If divisible by 5, replace the value with "Buzz"
3. If divisible by 15, replace the value with "FizzBuzz"

Return the tree with its new values.

### Approach and Efficiency
* Approach:
  * Build a method which has a recursive helper method and a changer helper method to update the values of the tree to the correct value.
* Method:
  * `public static Tree<Object> fizzBuzz(Tree tree)`
  * `private static void recursion(Node<Object> current)`
  * `private static void changer(Node<Object> current)`
* Time and Space:
  * `public static Tree<Object> fizzBuzz(Tree tree)`
    * T: O(n)
    * S: O(n) - stack space

### Collaboration
* Jack Kinne

### Solution
![fizz buzz tree](../assets/fizz-buzz-tree.jpg)