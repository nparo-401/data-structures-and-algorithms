package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

  @Test
  public void testEnqueue_AddOneValue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);

    assertEquals(
        "testEnqueue_AddOneValue should return: ",
        "1 -> null",
        queue.toString()
    );
  }

  @Test
  public void testEnqueue_AddMultipleValues() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);

    assertEquals(
        "testEnqueue_AddMultipleValues should return: ",
        "1 -> 2 -> 3 -> 4 -> null",
        queue.toString()
    );
  }

  @Test (expected = NullPointerException.class)
  public void testDequeue_RemoveFromEmpty() {
    Queue<Integer> queue = new Queue<>();
    queue.dequeue();
  }

  @Test
  public void testDequeue_RemoveOneValue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    int dequeueValue = queue.dequeue();

    assertEquals(
        "testDequeue_RemoveOneValue should return: ",
        1,
        dequeueValue
    );
  }

  @Test
  public void testDequeue_RemoveMultipleValues() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    int dequeueFirst = queue.dequeue();
    int dequeueSecond = queue.dequeue();

    assertTrue(
        "testDequeue_RemoveMultipleValues should return: ",
        dequeueFirst == 1 && dequeueSecond == 2
    );
  }

  @Test (expected = NullPointerException.class)
  public void testDequeue_RemoveTooManyValues() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    int dequeueFirst = queue.dequeue();
    int dequeueSecond = queue.dequeue();
    int dequeueThird = queue.dequeue();
  }

  @Test
  public void testPeek_OneValueInQueue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);

    assertEquals(
        "testPeek_MultipleValues should return: ",
        (Integer)1,
        queue.peek()
    );
  }

  @Test
  public void testPeek_MultipleValuesInQueue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);

    assertEquals(
        "testPeek_MultipleValues should return: ",
        (Integer)1,
        queue.peek()
    );
  }

  @Test (expected = NullPointerException.class)
  public void testPeek_NoValuesInQueue() {
    Queue<Integer> queue = new Queue<>();
    queue.peek();
  }
}