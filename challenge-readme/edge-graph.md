## Breadth First Graph
Create a static method which returns if there is a direct connection between a pair or set of edges.

### Links
* src/main/graph
  * [Graph.java](../code401challenges/src/main/java/graph/Graph.java)
* src/test/graph
  * [GraphTest.java](../code401challenges/src/test/java/graph/GraphTest.java)

### Challenge
Create a  method called `getEdge(Graph<F> graph, ArrayList<Vertex<F>> route)` which checks if there is a direct connection between a pair or set of edges. This method will return `True, ${price}` or `False, $0`.

### Approach and Efficiency
* Method:
  * `public static <V> String getEdge(Graph<V> graph, ArrayList<Vertex<V>> route)`
  * `pirvate static <V> boolean isConnectionPresent(Graph<V> graph, ArrayList<Vertex<V>> route)`
  * `private static <V> ArrayList<Vertex<V>> getPreviousVertices(ArrayList<Edge<V>> previousNeighbors)`
  * `private static String response()`
* Time and Space:
  * `public static <V> String getEdge(Graph<V> graph, ArrayList<Vertex<V>> route)`
    * T: O(nm)
    * S: O(n)
  * `pirvate static <V> boolean isConnectionPresent(Graph<V> graph, ArrayList<Vertex<V>> route)`
    * T: O(m)
    * S: O(n)
  * `private static <V> ArrayList<Vertex<V>> getPreviousVertices(ArrayList<Edge<V>> previousNeighbors)`
    * T: O(m)
    * S: O(n) - initializes `ArrayList`
  * `private static String response()`
    * T: O(1)
    * S: O(1)

### Collaboration/Resources
* [Baeldung Graph](https://www.baeldung.com/java-graphs)
* [Time and Space Complexity](https://stackoverflow.com/questions/30009987/space-complexity-of-java-data-structures)
