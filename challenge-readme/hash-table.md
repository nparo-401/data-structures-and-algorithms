## Hash Table

### Challenge
Create a class `HashTable<K,V>` which has `hash()`, `set()`, `get()`, `has()`, and `hashMapDouble()` methods.

Create a class `Node<K,V>`.

### Resources
* Melfi Perez
* Matt Stuhring
* Renee Messick
* Travis Cox
* Jack Kinne

### Files
* src/main/hashTable
  * [HashTable.java](../code401challenges/src/main/java/hashTable/HashTable.java)
  * [Node.java](../code401challenges/src/main/java/hashTable/Node.java)
* src/test/hashTable
  * [HashTableTest.java](../code401challenges/src/test/java/hashTable/HashTableTest.java)

### Approach and Efficiency
* Approach: Create a test driven Class which follows best practices and has optimized time and space.
* Time and Space:
  * HashTable:
    * `private int hash(K key)`
      * T: O(1)
      * S: O(1)
    * `public void set(K key, V value)`
      * T: O(n)
      * S: O(n)
    * `public V get(K key)`
      * T: O(1)
      * S: O(1)
    * `public boolean has(K key)`
      * T: O(1)
      * S: O(1)
    * `private void hashMapDouble(Node<K,V>[] map)`
      * T: O(n)
      * S: O(1)
    * `public String toString()`
      * T: O(1)
      * S: O(1)

### API
* **HashTable<K,V>**
  * Variable:
    * `private Node<K,V>[] map`
  * Constructor:
    * `HashTable(int size)`
  * Methods:
    * `public void set(K key, V value)`
    * `public V get(K key)`
    * `public boolean has(K key)`
    * `public String toString()`
