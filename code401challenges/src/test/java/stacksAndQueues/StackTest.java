package stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
  @Test
  public void testLength_EmptyStack() {
    Stack<Integer> stack = new Stack<>();

    assertEquals(
        "testLength_EmptyStack should return: ",
        0,
        stack.length()
    );
  }

  @Test
  public void testLength_OneValueStack() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);

    assertEquals(
        "testLength_OneValueStack should return: ",
        1,
        stack.length()
    );
  }

  @Test
  public void testLength_MultipleValueStack() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    assertEquals(
        "testLength_MultipleValueStack should return: ",
        4,
        stack.length()
    );
  }

  @Test
  public void testLength_MultipleValueStackWithPushAndPop() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.pop();
    stack.push(2);
    stack.push(3);
    stack.pop();
    stack.push(4);

    assertEquals(
        "testLength_MultipleValuesStackWithPushAndPop should return: ",
        2,
        stack.length()
    );
  }

  @Test
  public void testPush_OneValue() {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);

    assertEquals(
        "testPush_MultipleValues should return: ",
        "top -> 1 -> null",
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
        "top -> 1 -> 3 -> 2 -> 1 -> null",
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
    stack.pop();
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