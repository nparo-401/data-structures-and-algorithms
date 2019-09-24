package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;
import static stacksAndQueues.Reverse.reverse;

public class ReverseTest {
  
  @Test
  public void testReverse () {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(5);
    queue.enqueue(4);
    reverse(queue);
  
    System.out.println(queue);
  }
}