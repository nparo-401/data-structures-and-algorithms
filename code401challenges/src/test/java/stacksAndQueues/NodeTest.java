package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

  @Test
  public void testGetValue() {
    Node<Integer> node = new Node<>();
    node.setValue(1);

    assertEquals(
        "testGetValue should return: ",
        (Integer)1,
        node.getValue()
    );
  }

  @Test
  public void testGetNext() {
    Node<Integer> first = new Node<>();
    Node<Integer> second = new Node<>();
    first.setValue(1);
    second.setValue(2);
    first.setNext(second);

    assertEquals("testGetNext should return: ",
        second,
        first.getNext()
    );
  }
}