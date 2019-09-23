package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

import static graph.Graph.breadthFirst;
import static graph.Graph.depthFirst;
import static org.junit.Assert.*;

public class GraphTest {
  
  @Test (expected = NoSuchElementException.class)
  public void testAddVertex_NoneAdded () {
    Graph<String> graph = new Graph<>();
    graph.toString();
  }
  
  @Test
  public void testAddVertex_EvenAdded () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    
    assertEquals(
     "testAddVertex_EvenAdded should return",
     "Bob: []\n" +
      "Joe: []\n",
     graph.toString()
    );
  }
  
  @Test
  public void testAddVertex_OddAdded () {
    Graph<String> graph = new Graph<>();
    graph.addVertex("Bob");
  
    assertEquals(
     "testAddVertex_EvenAdded should return",
     "Bob: []\n",
     graph.toString()
    );
  }
  
  @Test (expected = NoSuchElementException.class)
  public void testAddEdge_NotInGraph () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = new Vertex<>("Bill");
    graph.addEdge(v1, v2, 0);
  }
  
  @Test
  public void testAddEdge_OneEdge () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Edge<String> e1 = graph.addEdge(v1, v2, 0);
    
    ArrayList<Edge<String>> expected = new ArrayList<>();
    expected.add(e1);
    
    assertEquals(expected, graph.getNeighbors(v1));
  }

  @Test
  public void testAddEdge_TwoEdge () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Jane");
    Edge<String> e1 = graph.addEdge(v1, v2,0);
    Edge<String> e2 = graph.addEdge(v1, v3, 0);
  
    ArrayList<Edge<String>> expected = new ArrayList<>();
    expected.add(e1);
    expected.add(e2);
  
    assertEquals(expected, graph.getNeighbors(v1));
  }

  @Test
  public void testAddEdge_MultipleEdge () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Jane");
    Vertex<String> v4 = graph.addVertex("Snoopy");
    Edge<String> e1 = graph.addEdge(v1, v2, 0);
    Edge<String> e2 = graph.addEdge(v1, v3, 0);
    Edge<String> e3 = graph.addEdge(v2, v4, 0);
    Edge<String> e4 = graph.addEdge(v1, v4, 0);
  
    ArrayList<Edge<String>> expected = new ArrayList<>();
    expected.add(e1);
    expected.add(e2);
    expected.add(e4);
    
    assertEquals(expected, graph.getNeighbors(v1));
  }

  @Test (expected = NoSuchElementException.class)
  public void testGetNodes_NoNode () {
    Graph<String> graph = new Graph<>();
    graph.getNodes();
  }

  @Test
  public void testGetNodes_OneNode () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");

    ArrayList<Vertex<String>> expected = new ArrayList<>();
    expected.add(v1);

    assertEquals("testGetNodes_OneNode should return", expected, graph.getNodes());
  }

  @Test
  public void testGetNodes_MultipleNode () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Bill");
    Vertex<String> v3 = graph.addVertex("Boe");
    Vertex<String> v4 = graph.addVertex("Boo");

    ArrayList<Vertex<String>> expected = new ArrayList<>();
    expected.add(v3);
    expected.add(v4);
    expected.add(v1);
    expected.add(v2);
    
    graph.getNodes().forEach((value -> assertTrue(expected.contains(value))));
  }

  @Test
  public void testDepthFirst_TwoLevels () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Jane");
    Vertex<String> v4 = graph.addVertex("Snoopy");
    graph.addEdge(v1, v2, 0);
    graph.addEdge(v1, v3, 0);

    Set<Vertex<String>> expected = new HashSet<>();
    expected.add(v1);
    expected.add(v2);
    expected.add(v3);

    assertEquals(
     "testDepthFirst_TwoLevels should return",
     expected,
     depthFirst(graph, v1)
    );
  }

  @Test
  public void testDepthFirst_MultipleLevels () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Jane");
    Vertex<String> v4 = graph.addVertex("Snoopy");
    graph.addEdge(v1, v2, 0);
    graph.addEdge(v1, v3, 0);
    graph.addEdge(v2, v4, 0);
    graph.addEdge(v4, v1, 0);

    Set<Vertex<String>> expected = new HashSet<>();
    expected.add(v1);
    expected.add(v4);
    expected.add(v2);
    expected.add(v3);

    assertEquals(
     "testDepthFirst_MultipleLevels should return",
     expected,
     depthFirst(graph, v1)
    );
  }

  @Test
  public void testDepthFirst_WithIsland () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Jane");
    Vertex<String> v4 = graph.addVertex("Snoopy");
    graph.addEdge(v1, v2, 0);
    graph.addEdge(v1, v3, 0);

    Set<Vertex<String>> expected = new HashSet<>();
    expected.add(v1);
    expected.add(v2);
    expected.add(v3);

    assertEquals(
     "testDepthFirst_WithIsland should return",
     expected,
     depthFirst(graph, v1)
    );
  }

  @Test
  public void testBreadthFirst_TwoLevels () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Jane");
    graph.addEdge(v1, v2, 0);
    graph.addEdge(v1, v3, 0);

    Set<Vertex<String>> expected = new HashSet<>();
    expected.add(v1);
    expected.add(v2);
    expected.add(v3);

    assertEquals(
     "testBreadthFirst_MultipleLevels should return",
     expected,
     breadthFirst(graph, v1)
    );
  }

  @Test
  public void testBreadthFirst_MultipleLevels () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Jane");
    Vertex<String> v4 = graph.addVertex("Snoopy");
    graph.addEdge(v1, v2, 0);
    graph.addEdge(v1, v3, 0);
    graph.addEdge(v2, v4, 0);
    graph.addEdge(v4, v1, 0);

    Set<Vertex<String>> expected = new HashSet<>();
    expected.add(v1);
    expected.add(v2);
    expected.add(v3);
    expected.add(v4);

    assertEquals(
     "testBreadthFirst_MultipleLevels should return",
     expected,
     breadthFirst(graph, v1)
    );
  }

  @Test
  public void testBreadthFirst_WithIsland () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Jane");
    Vertex<String> v4 = graph.addVertex("Snoopy");
    graph.addEdge(v1, v2, 0);
    graph.addEdge(v1, v3, 0);

    Set<Vertex<String>> expected = new HashSet<>();
    expected.add(v1);
    expected.add(v2);
    expected.add(v3);

    assertEquals(
     "testBreadthFirst_WithIsland should return",
     expected,
     breadthFirst(graph, v1)
    );
  }

  @Test
  public void getNeighbors_None () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Snoopy");
    graph.addEdge(v2, v3, 0);

    ArrayList<Edge<String>> expected = new ArrayList<>();

    assertEquals(expected, graph.getNeighbors(v1));
  }

  @Test
  public void getNeighbors_One () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Snoopy");
    graph.addEdge(v2, v3, 0);

    ArrayList<Edge<String>> expected = new ArrayList<>();
    expected.add(new Edge<>(0, v2));

    for (int i = 0; i < graph.getNeighbors(v3).size(); i++) {
      assertEquals(
       "testGetNeighbors_Multiple should return",
       expected.get(i).getVertex().getValue(),
       graph.getNeighbors(v3).get(i).getVertex().getValue()
      );
    }
  }

  @Test
  public void getNeighbors_Multiple () {
    Graph<String> graph = new Graph<>();
    Vertex<String> v1 = graph.addVertex("Bob");
    Vertex<String> v2 = graph.addVertex("Joe");
    Vertex<String> v3 = graph.addVertex("Snoopy");
    graph.addEdge(v2, v3, 0);
    graph.addEdge(v3, v1, 0);

    ArrayList<Edge<String>> expected = new ArrayList<>();
    expected.add(new Edge<>(0, v2));
    expected.add(new Edge<>(0, v1));

    for (int i = 0; i < graph.getNeighbors(v3).size(); i++) {
      assertEquals(
       "testGetNeighbors_Multiple should return",
       expected.get(i).getVertex().getValue(),
       graph.getNeighbors(v3).get(i).getVertex().getValue()
      );
    }
  }

  @Test
  public void testSize_NoneAdded () {
    Graph<String> graph = new Graph<>();

    assertEquals("testSize_NoneAdded should return", 0, graph.size());
  }

  @Test
  public void testSize_OneAdded () {
    Graph<String> graph = new Graph<>();
    graph.addVertex("Bob");

    assertEquals("testSize_OneAdded should return", 1, graph.size());
  }

  @Test
  public void testSize_MultipleAdded () {
    Graph<String> graph = new Graph<>();
    graph.addVertex("Bob");
    graph.addVertex("Bill");
    graph.addVertex("Bam");
    graph.addVertex("Boo");
    graph.addVertex("Boi");
    graph.addVertex("Bae");

    assertEquals("testSize_OneAdded should return", 6, graph.size());
  }
}