package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

  @Test
  public void testLinkedList_EmptyLinkedList() {
    LinkedList<String> testLL = new LinkedList<>();

    assertNull(
        "testLinkedList_EmptyLinkedList",
        testLL.getHead()
    );
  }

  @Test
  public void testSetHead_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("Hello");

    assertEquals(
        "testSetHead_String should return: ",
        "Hello null",
        testLL.toString()
    );
  }

  @Test
  public void testSetHead_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);

    assertEquals(
        "testSetHead_String should return: ",
        "111 null",
        testLL.toString()
    );
  }

  @Test
  public void testSetHead_HeadIsHead() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.prepend(222);

    assertEquals("testSetHead_HeadToHead should return: ",
        (Integer)222,
        testLL.getHead().getValue()
    );
  }

  @Test
  public void testInsert_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("World");
    testLL.prepend("the");
    testLL.prepend("around");
    testLL.prepend("all");
    testLL.prepend("from");
    testLL.prepend("Hello");

    assertEquals(
        "testInsert_String should return: ",
        "Hello from all around the World null",
        testLL.toString()
    );
  }

  @Test
  public void testInsert_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.prepend(222);

    assertEquals(
        "testInsert_integer should return: ",
        "222 111 null",
        testLL.toString()
    );
  }

  @Test
  public void testIncludes_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("World");
    testLL.prepend("the");
    testLL.prepend("around");
    testLL.prepend("all");
    testLL.prepend("from");
    testLL.prepend("Hello");

    assertTrue(
        "testIncludes_String should return: true",
        testLL.includes("all")
    );
  }

  @Test
  public void testIncludes_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.prepend(222);
    testLL.prepend(333);

    assertTrue(
        "testIncludes_Integer should return: true",
        testLL.includes(333)
    );
  }

  @Test
  public void testIncludes_NotInLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.prepend(222);

    assertFalse(
        "testIncludes_NotInLinkedList should return: false",
        testLL.includes(333)
    );
  }

  @Test
  public void testAppend_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("Hello");
    testLL.append("World");

    assertEquals(
        "testAppend_ should return: ",
        "Hello World null",
        testLL.toString()
    );
  }

  @Test
  public void testAppend_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.prepend(222);
    testLL.append(333);

    assertEquals(
        "testAppend_ should return: ",
        "222 111 333 null",
        testLL.toString()
    );
  }

  @Test
  public void testInsertBefore_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("Hello");
    testLL.append("World");
    testLL.insertBefore("World", "Big");

    assertEquals(
        "testInsertBefore_String should return : ",
        "Hello Big World null",
        testLL.toString()
    );
  }

  @Test
  public void testInsertBefore_StringAsNewHead() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("Hello");
    testLL.insertBefore("Hello", "World");

    assertEquals(
        "testInsertBefore_StringAsNewHead should return: ",
        "World Hello null",
        testLL.toString());
  }

  @Test
  public void testInsertBefore_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.append(222);
    testLL.insertBefore(222, 333);

    assertEquals(
        "testInsertBefore_Integer should return: ",
        "111 333 222 null",
        testLL.toString()
    );
  }

  @Test
  public void testInsertBefore_IntegerNotInLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.append(222);
    testLL.insertBefore(333, 444);

    assertEquals(
        "testInsertBefore_IntegerNotInLinkedList should return: ",
        "111 222 null",
        testLL.toString()
    );
  }

  @Test
  public void testInsertAfter_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("Hello");
    testLL.insertAfter("Hello", "Big");

    assertEquals(
        "testInsertAfter_String should return: ",
        "Hello Big null",
        testLL.toString()
    );
  }

  @Test
  public void testInsertAfter_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.append(222);
    testLL.insertAfter(222, 333);

    assertEquals(
        "testInsertAfter_Integer should return: ",
        "111 222 333 null",
        testLL.toString()
    );
  }

  @Test
  public void testInsertAfter_IntegerNotInLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.append(222);
    testLL.insertAfter(333, 444);

    assertEquals(
        "testInsertAfter_IntegerNotInLinkedList should return: ",
        "111 222 null",
        testLL.toString()
    );
  }
}
