## Linked List Insertions
Write a method which takes in two linked lists and zipper merges them into one list.


### Links
* [LinkedList.java](../code401challenges/src/main/java/linkedList/LinkedList.java) 
* [Node.java](../code401challenges/src/main/java/linkedList/Node.java)
* [LinkedListTest.java](../code401challenges/src/test/java/linkedList/LinkedListTest.java)

### Challenge
* Write a method called `merge` which takes in two linked lists and does a zipper merge on them to create one linked list. The `merge` returns a reference to the head of the newly merged linked list - this will allow the new linked list to be referenced at a later time.

### Approach and Efficiency
**Iterative**
* Methods:
  * `public static <F> LinkedList<F> merge(LinkedList<F> firstList, LinkedList<F> secondList)`
* Time and Space Efficiency:
  * `merge(LinkedList<F> firstLink, LinkedList<F> secondList)`
    * Time: O(n)
    * Space: O(1)

**Recursive**
* Methods:
  * `public static <F> LinkedList<F> mergeLists(LinkedList<F> list1, LinkedList<F> list2)`
    * Creates a new LinkedList<F> and calls `mergeLists(Node<F> head1, Node<F> head2)`
  * `private static <F> Node<F> mergeLists(Node<F> head1, Node<F> head2)`
    * Performs a conditional check: 
      * if `head1 == null` then `return head2`
      * else set `head1.setNext(mergeLists(head2, head1.getNext()))` then `return head1`
* Time and Space Efficiency:
  * Time: O(n)
  * Space: O(n)

### Collaboration
* Sapana Poudel

### Solution
![append](../assets/linked-list-merge.jpg)
