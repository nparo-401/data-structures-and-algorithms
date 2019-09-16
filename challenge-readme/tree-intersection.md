## Tree Intersection
Finds the set of all values contained within both trees.

### Links
* src/main/TreeIntersection
  * [TreeIntersection.java](../code401challenges/src/main/java/TreeIntersection/TreeIntersection.java)
* src/test/TreeIntersection
  * [TreeIntersectionTest.java](../code401challenges/src/test/java/TreeIntersection/TreeIntersectionTest.java)

### Challenge
Create a  method called `treeIntersection(Tree<V> tree1, Tree<V> tree2)` which takes in two trees, checks if there are any values contained within both trees, and returns a Hash Table containing the values within both trees.

### Approach and Efficiency
* Approach:
* Method:
  * `public static <V> HashTable<V,V> treeIntersection(Tree<V> tree1, Tree<V> tree2)`
  * `public static <V extends Comparable<V>> ArrayList<V> treeIntersection(BinarySearchTree<V> bst1, BinarySearchTree<V> bst2)`
* Time and Space:
  * `public static <V> HashTable<V,V> treeIntersection(Tree<V> tree1, Tree<V> tree2)`
    * T: O(n)
    * S: O(n)
  * `public static <V extends Comparable<V>> ArrayList<V> treeIntersection(BinarySearchTree<V> bst1, BinarySearchTree<V> bst2)`
    * T: O(n)
    * S: O(n)

### Collaboration/Resources
* Travis Cox
* Matt Stuhring
* Jack Kinne
* Melfi Perez
* Renee Messick
