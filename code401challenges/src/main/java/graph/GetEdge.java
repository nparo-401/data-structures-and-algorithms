package graph;

import java.util.ArrayList;

public class GetEdge {
  private static int price = 0;
  private static boolean check = false;
  
  public static <V> String getEdge(Graph<V> graph, ArrayList<Vertex<V>> route) {
    if (isConnectionPresent(graph, route)) {
      for (int i = 1; i < route.size(); i++) {
        ArrayList<Edge<V>> previousPlaceNeighbors = graph.getNeighbors(route.get(i - 1));
        ArrayList<Vertex<V>> previousVertices = getPreviousVertices(previousPlaceNeighbors);
        for (int j = 0; j < previousVertices.size(); j++) {
          if (route.get(i).equals(previousVertices.get(j))) {
            price += previousPlaceNeighbors.get(j).getWeight();
            check = true;
            break;
          }
        }
      }
    }
    return response();
  }
  
  private static <V> boolean isConnectionPresent(Graph<V> graph, ArrayList<Vertex<V>> route) {
    ArrayList<Edge<V>> edges = graph.getNeighbors(route.get(0));
    ArrayList<Vertex<V>> previousVertices = getPreviousVertices(edges);
    return previousVertices.contains(route.get(1));
  }
  
  private static <V> ArrayList<Vertex<V>> getPreviousVertices(ArrayList<Edge<V>> previousNeighbors) {
    ArrayList<Vertex<V>> vertices = new ArrayList<>();
    previousNeighbors.forEach(value -> vertices.add(value.getVertex()));
    return vertices;
  }
  
  private static String response() {
    StringBuilder response = new StringBuilder();
    String checkStr = Boolean.toString(check);
    response.append(checkStr.substring(0, 1).toUpperCase()).append(checkStr.substring(1)).append(", $");
    if (check) {
      response.append(price);
      price = 0;
    } else {
      price = 0;
      response.append(price);
    }
    check = false;
    return response.toString();
  }
}
