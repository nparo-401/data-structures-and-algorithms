package graph;

import java.util.*;

public class Graph<T> {
  private int size;
  private Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList;
  
  public Graph() {
    this.adjacencyList = new HashMap<>();
    this.size = 0;
  }
  
  public Graph(Map<Vertex<T>, ArrayList<Edge<T>>> adjacencyList) {
    this.adjacencyList = adjacencyList;
    this.size = 0;
  }
  
  public Vertex<T> addVertex(T label) {
    Vertex<T> vertex = new Vertex<>(label);
    adjacencyList.put(vertex, new ArrayList<>());
    this.size++;
    return vertex;
  }
  
  public Edge<T> addEdge(Vertex<T> a, Vertex<T> b, int weight) {
    if (adjacencyList.containsKey(a) && adjacencyList.containsKey(b)) {
      Edge<T> aEdge = new Edge<>(weight, b);
      Edge<T> bEdge = new Edge<>(weight, a);
      adjacencyList.get(a).add(aEdge);
      adjacencyList.get(b).add(bEdge);
      return aEdge;
    } else {
      throw new NoSuchElementException();
    }
  }
  
  public ArrayList<Vertex<T>> getNodes() {
    if (this.adjacencyList.isEmpty()) {
      throw new NoSuchElementException();
    } else {
      ArrayList<Vertex<T>> res = new ArrayList<>();
      this.adjacencyList.forEach((key, value) -> res.add(key));
      return res;
    }
  }
  
  public ArrayList<Edge<T>> getNeighbors(Vertex<T> vertex) {
    return this.adjacencyList.get(vertex);
  }
  
  public int size() {
    return this.size;
  }
  
  public static <F> Set<Vertex<F>> depthFirst(Graph<F> graph, Vertex<F> root) {
    Set<Vertex<F>> visited = new LinkedHashSet<>();
    Stack<Vertex<F>> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      Vertex<F> v = stack.pop();
      if (!visited.contains(v)) {
        visited.add(v);
        for (Edge<F> e: graph.getNeighbors(v)) {
          stack.push(e.getVertex());
        }
      }
    }
    return visited;
  }

  public static <F> Set<Vertex<F>> breadthFirst(Graph<F> graph, Vertex<F> root) {
    if (!graph.getNodes().contains(root)) {
      throw new NoSuchElementException();
    } else {
      Set<Vertex<F>> visited = new LinkedHashSet<>();
      Queue<Vertex<F>> queue = new LinkedList<>();
      queue.add(root);
      visited.add(root);
      while (!queue.isEmpty()) {
        Vertex<F> vertex = queue.poll();
        for (Edge<F> e: graph.getNeighbors(vertex)) {
          if (!visited.contains(e.getVertex())) {
            visited.add(e.getVertex());
            queue.add(e.getVertex());
          }
        }
      }
      return visited;
    }
  }
  
  @Override
  public String toString() {
    if (adjacencyList.isEmpty()) {
      throw new NoSuchElementException();
    } else {
      StringBuilder res = new StringBuilder();
      adjacencyList.forEach((key, value) -> res.append(key.getValue()).append(": ").append(value).append("\n"));
      return res.toString();
    }
  }
}
