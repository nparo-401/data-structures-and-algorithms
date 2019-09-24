package graph;

import org.junit.Test;

import java.util.ArrayList;

import static graph.GetEdge.getEdge;
import static org.junit.Assert.*;

public class GetEdgeTest {
  
  @Test
  public void testGetEdge_NoConnection () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Pandora");
    Vertex<String> v2 = graph.addVertex("Metroville");
    Vertex<String> v3 = graph.addVertex("Narnia");
    Vertex<String> v4 = graph.addVertex("Arendelle");
    graph.addEdge(v1, v2, 82);
    graph.addEdge(v3, v4, 20);
    
    ArrayList<Vertex<String>> list = new ArrayList<>();
    list.add(v1);
    list.add(v4);
    
    assertEquals(
     "testGetEdge_NoConnection should return",
     "False, $0",
     getEdge(graph, list)
    );
  }
  
  @Test
  public void testGetEdge_DirectFlight () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Pandora");
    Vertex<String> v4 = graph.addVertex("Arendelle");
    graph.addEdge(v1, v4, 150);

    ArrayList<Vertex<String>> list = new ArrayList<>();
    list.add(v1);
    list.add(v4);

    assertEquals(
     "testGetEdge_DirectFlight should return",
     "True, $150",
     getEdge(graph, list)
    );
  }

  @Test
  public void testGetEdge_OneConnection () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Pandora");
    Vertex<String> v2 = graph.addVertex("Metroville");
    Vertex<String> v3 = graph.addVertex("Narnia");
    graph.addEdge(v1, v2, 82);
    graph.addEdge(v2, v3, 20);

    ArrayList<Vertex<String>> list = new ArrayList<>();
    list.add(v1);
    list.add(v2);
    list.add(v3);

    assertEquals(
     "testGetEdge_OneConnection should return",
     "True, $102",
     getEdge(graph, list)
    );
  }

  @Test
  public void testGetEdge_MultipleConnection () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Pandora");
    Vertex<String> v2 = graph.addVertex("Metroville");
    Vertex<String> v3 = graph.addVertex("Narnia");
    Vertex<String> v4 = graph.addVertex("Arendelle");
    Vertex<String> v5 = graph.addVertex("Monstropolis");
    graph.addEdge(v1, v2, 82);
    graph.addEdge(v2, v3, 20);
    graph.addEdge(v3, v4, 90);
    graph.addEdge(v4, v5, 25);

    ArrayList<Vertex<String>> list = new ArrayList<>();
    list.add(v1);
    list.add(v2);
    list.add(v3);
    list.add(v4);
    list.add(v5);

    assertEquals(
     "testGetEdge_MultipleConnection should return",
     "True, $217",
     getEdge(graph, list)
    );
  }
}