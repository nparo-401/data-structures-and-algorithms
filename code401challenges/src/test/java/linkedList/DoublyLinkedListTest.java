package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoublyLinkedListTest {
  @Test
  public void testDoubleLinkedList_EmptyLinkedListFromHead() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();

    assertNull(
      "testDoubleLinkedList_EmptyLinkedListFromHead",
      testDLL.getHead()
    );
  }

  @Test
  public void testDoubleLinkedList_EmptyLinkedListFromTail() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();

    assertNull(
        "testDoubleLinkedList_EmptyLinkedListFromHead",
        testDLL.getTail()
    );
  }

  @Test
  public void testSetHead_Value() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");

    assertEquals(
        "testSetHead should return: ",
        "Hello",
        testDLL.toString()
    );
  }

  @Test
  public void testSetHead_Previous() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");

    assertEquals(
        "testSetHead should return: ",
        "Hello",
        testDLL.toString()
    );
  }

  @Test
  public void testSetHead_Next() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");

    assertEquals(
        "testSetHead_Next should return: World",
        testDLL.getTail(),
        testDLL.getHead().getNext()
    );
  }

  @Test
  public void testSetTail_Previous() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");

    assertEquals(
        "testSetTail_Previous should return: Hello",
        testDLL.getHead(),
        testDLL.getTail().getPrevious()
    );
  }

  @Test
  public void testInsertBeforeHead() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.insertBeforeHead("Really");

    assertEquals(
        "testInsertBeforeHead toString() should return: Really Hello",
        "Really",
        testDLL.getHead().getValue()
    );
  }

  @Test
  public void testInsertAfterTail() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");
    testDLL.insertAfterTail("Really");

    assertEquals(
        "testInsertBeforeHead toString() should return: Really Hello",
        "Really",
        testDLL.getTail().getValue()
    );
  }
}