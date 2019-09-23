## Graph

### Challenge
Create a class `Graph` with methods:
* `addVertex()`
* `addEdge()`
* `getNodes()`
* `getNeighbors()`
* `size()`

### Resources
* Melfi Perez
* Matt Stuhring
* Renee Messick
* Travis Cox
* Jack Kinne
* [Baeldung Graph](https://www.baeldung.com/java-graphs)
* [Geeks for Geeks Graph](https://www.geeksforgeeks.org/graph-and-its-representations/)
* [Set Iteration](https://javatutorial.net/java-iterate-hashmap-example)

### Files
* src/main/graph
  * [Graph.java](../code401challenges/src/main/java/graph/Graph.java)
  * [Vertex.java](../code401challenges/src/main/java/graph/Vertex.java)
  * [Edge.java](../code401challenges/src/main/java/graph/Edge.java)
* src/test/graph
  * [GraphTest.java](../code401challenges/src/test/java/graph/GraphTest.java)

### Approach and Efficiency
* Approach: Create a test driven Class which follows best practices and has optimized time and space.
* Time and Space:
  * Graph:
    * `public Vertex<T> addVertex(T label)`
      * T: O(1)
      * S: O(n)
    * `public Edge<T> addEdge(Vertex<T> a, Vertex<T> b, int weight)`
      * T: O(1)
      * S: O(n)
    * `public ArrayList<Vertex<T>> getNodes()`
      * T: O(1)
      * S: O(n)
    * `public ArrayList<Edge<T>> getNeighbors(Vertex<T> vertex)`
      * T: O(1)
      * S: O(1)
    * `public int size()`
      * T: O(1)
      * S: O(1)

### API
* **Graph**
  * Variable:
    * `int size`
    * `Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList`
  * Constructor:
    * `public Graph()`
    * `public Graph(Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList)`
  * Methods:
    * `public Vertex<T> addVertex(T label)`
    * `public Edge<T> addEdge(Vertex<T> a, Vertex<T> b, int weight)`
    * `public ArrayList<Vertex<T>> getNodes()`
    * `public ArrayList<Edge<T>> getNeighbors(Vertex<T> vertex)`
    * `public int size()`
    * `public String toString()`
