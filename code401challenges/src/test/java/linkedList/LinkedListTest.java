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
        "Hello",
        testLL.toString()
    );
  }

  @Test
  public void testSetHead_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);

    assertEquals(
        "testSetHead_String should return: ",
        "111",
        testLL.toString()
    );
  }

  @Test
  public void testSetHead_HeadIsHead() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.insertBeforeHead(222);

    assertEquals("testSetHead_HeadToHead should return: ",
        (Integer)222,
        testLL.getHead().getValue()
    );
  }

  @Test
  public void testInsert_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("World");
    testLL.insertBeforeHead("the");
    testLL.insertBeforeHead("around");
    testLL.insertBeforeHead("all");
    testLL.insertBeforeHead("from");
    testLL.insertBeforeHead("Hello");

    assertEquals(
        "testInsert_String should return: ",
        "Hello from all around the World",
        testLL.toString()
    );
  }

  @Test
  public void testInsert_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.insertBeforeHead(222);

    assertEquals(
        "testInsert_integer should return: ",
        "222 111",
        testLL.toString()
    );
  }

  @Test
  public void testIncludes_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("World");
    testLL.insertBeforeHead("the");
    testLL.insertBeforeHead("around");
    testLL.insertBeforeHead("all");
    testLL.insertBeforeHead("from");
    testLL.insertBeforeHead("Hello");

    assertTrue(
        "testIncludes_String should return: true",
        testLL.includes("all")
    );
  }

  @Test
  public void testIncludes_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.insertBeforeHead(222);
    testLL.insertBeforeHead(333);

    assertTrue(
        "testIncludes_Integer should return: true",
        testLL.includes(333)
    );
  }

  @Test
  public void testIncludes_NotInLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.insertBeforeHead(222);

    assertFalse(
        "testIncludes_NotInLinkedList should return: false",
        testLL.includes(333)
    );
  }
}
