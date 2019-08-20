package stacksAndQueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class PseudoQueueTest {
  @Test
  public void testEnqueue_OneValueAdded() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);

    assertEquals(
        "testEnqueue_OneValueAdded should return: ",
        "front -> 1 -> back",
        pseudoQueue.toString()
    );
  }

  @Test
  public void testEnqueue_MultipleValuesAdded() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);
    pseudoQueue.enqueue(2);

    assertEquals(
        "testEnqueue_MultipleValuesAdded should return: ",
        "front -> 1 -> 2 -> back",
        pseudoQueue.toString()
    );
  }

  @Test (expected = NoSuchElementException.class)
  public void testDequeue_EnqueueNonDequeueOne() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.dequeue();
  }

  @Test (expected = NoSuchElementException.class)
  public void testDequeue_EnqueueOneDequeueTwo() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);
    pseudoQueue.dequeue();
    pseudoQueue.dequeue();
  }

  @Test
  public void testDequeue_EnqueueOneDequeueOne() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);
    int val = pseudoQueue.dequeue();
    assertEquals("Queue is empty", pseudoQueue.toString());
    assertEquals(1, val);
  }

  @Test
  public void testDequeue_EnqueueTwoDequeueTwo() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);
    pseudoQueue.enqueue(4);
    int first = pseudoQueue.dequeue();
    int second = pseudoQueue.dequeue();
    assertEquals("Queue is empty", pseudoQueue.toString());
    assertTrue(first == 1 && second == 4);
  }

  @Test
  public void testAllOfTheThings() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);
    assertFalse(pseudoQueue.isEmpty());
    assertEquals("front -> 1 -> back", pseudoQueue.toString());
    pseudoQueue.dequeue();
    assertTrue(pseudoQueue.isEmpty());
    assertEquals("Queue is empty", pseudoQueue.toString());
    pseudoQueue.enqueue(2);
    assertFalse(pseudoQueue.isEmpty());
    assertEquals("front -> 2 -> back", pseudoQueue.toString());
    pseudoQueue.enqueue(3);
    assertFalse(pseudoQueue.isEmpty());
    assertEquals("front -> 2 -> 3 -> back", pseudoQueue.toString());
    pseudoQueue.dequeue();
    assertFalse(pseudoQueue.isEmpty());
    assertEquals("front -> 3 -> back", pseudoQueue.toString());
    pseudoQueue.enqueue(4);
    assertFalse(pseudoQueue.isEmpty());
    assertEquals("front -> 3 -> 4 -> back", pseudoQueue.toString());
  }
}
