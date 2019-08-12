package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

  @Test
  public void testLinkedList_EmptyLinkedList() {
    LinkedList<String> testLL = new LinkedList<>();

    assertNull(
        "testLinkedList_EmptyLinkedList",
        testLL.head
        );
  }

  @Test
  public void testSetHead_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("Hello");
    assertEquals(
        "testSetHead_String should return: ",
        "Hello",
        testLL.toString());
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
    testLL.insert(222);

    assertEquals("testSetHead_HeadToHead should return: ",
        (Integer)222,
        testLL.head.data
    );
  }

  @Test
  public void testInsert_String() {
    LinkedList<String> testLL = new LinkedList<>();
    testLL.setHead("World");
    testLL.insert("the");
    testLL.insert("around");
    testLL.insert("all");
    testLL.insert("from");
    testLL.insert("Hello");

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
    testLL.insert(222);

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
    testLL.insert("the");
    testLL.insert("around");
    testLL.insert("all");
    testLL.insert("from");
    testLL.insert("Hello");

    assertTrue(
        "testIncludes_String should return: ",
        testLL.includes("all")
    );
  }

  @Test
  public void testIncludes_Integer() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.insert(222);
    testLL.insert(333);

    assertTrue(
        "testIncludes_Integer should return: ",
        testLL.includes(333)
    );
  }

  @Test
  public void testIncludes_NotInLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(111);
    testLL.insert(222);

    assertFalse(
        "testIncludes_NotInLinkedList: ",
        testLL.includes(333)
    );
  }
}