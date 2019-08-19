package stacksAndQueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest {
  @Test
  public void testPush_OneValue() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);

    assertEquals(
        "testPush_MultipleValues should return: ",
        "1 -> null",
        stack.toString()
    );
  }

  @Test
  public void testPush_MultipleValues() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(1);

    assertEquals(
        "testPush_MultipleValues should return: ",
        "1 -> 3 -> 2 -> 1 -> null",
        stack.toString()
    );
  }

  @Test
  public void testPop_OneValuePopped() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);

    assertEquals(
        "testPop_OneValuePopped should return: ",
        (Integer)2,
        stack.pop()
    );
  }

  @Test
  public void testPop_MultipleValuesPopped() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    int first = stack.pop();
    int second = stack.pop();

    assertTrue(
        "testPop_OneValuePopped should return: ",
        first == 2 && second == 1
    );
  }

  @Test (expected = NullPointerException.class)
  public void testPop_NoValuesInStack() {
    Stack<Integer> stack = new Stack<>();
    int first = stack.pop();
  }

  @Test
  public void testPeek_OneValueInStack() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);

    assertEquals(
        "testPeek_MultipleValues should return: ",
        (Integer)1,
        stack.peek()
    );  }

  @Test
  public void testPeek_MultipleValuesInStack() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);

    assertEquals(
        "testPeek_MultipleValues should return: ",
        (Integer)2,
        stack.peek()
    );
  }

  @Test (expected = NullPointerException.class)
  public void testPeek_NoValuesInStack() {
    Stack<Integer> stack = new Stack<>();
    stack.peek();
  }
}