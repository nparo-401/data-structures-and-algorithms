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

    assertNull(
        "testSetHead should return: ",
        testDLL.getHead().getPrevious()
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
  public void testSetTail_Value() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");

    assertEquals(
        "testSetTail_Value should return: World",
        "World",
        testDLL.getTail().getValue()
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
  public void testSetTail_Next() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");

    assertNull(
        "testSetTail_Next should return: null",
        testDLL.getTail().getNext()
    );
  }

  @Test
  public void testPrepend_Value() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.prepend("Really");

    assertEquals(
        "testPrepend_Value should return: Really",
        "Really",
        testDLL.getHead().getValue()
    );
  }

  @Test
  public void testPrepend_Previous() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.prepend("Really");

    assertNull(
        "testPrepend_Previous should return: null",
        testDLL.getHead().getPrevious()
    );
  }

  @Test
  public void testPrepend_Next() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.prepend("Really");

    assertEquals(
        "testPrepend_Value should return: Hello",
        "Hello",
        testDLL.getHead().getNext().getValue()
    );
  }

  @Test
  public void testAppend_Value() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");
    testDLL.append("Really");

    assertEquals(
        "testAppend_Value should return: Really",
        "Really",
        testDLL.getTail().getValue()
    );
  }

  @Test
  public void testAppend_Previous() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");
    testDLL.append("Really");

    assertEquals(
        "testAppend_Previous should return: World",
        "World",
        testDLL.getTail().getPrevious().getValue()
    );
  }

  @Test
  public void testAppend_Next() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");
    testDLL.append("Really");

    assertNull(
        "testAppend_Next should return: null",
        testDLL.getTail().getNext()
    );
  }

  @Test
  public void testIncludesFromHead_InDoublyLinkedList() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");
    testDLL.append("Really");

    assertTrue(
        "testIncludesFromHead_InDoublyLinkedList should return: true",
        testDLL.includesFromHead("World")
    );
  }

  @Test
  public void testIncludesFromHead_NotInDoublyLinkedList() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");
    testDLL.append("Really");

    assertFalse(
        "testIncludesFromHead_NotInDoublyLinkedList should return: false",
        testDLL.includesFromHead("Big")
    );
  }

  @Test
  public void testIncludesFromTail_InDoublyLinkedList() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");
    testDLL.append("Really");

    assertTrue(
        "testIncludesFromTail_InDoublyLinkedList should return: true",
        testDLL.includesFromTail("World")
    );
  }

  @Test
  public void testIncludesFromTail_NotInDoublyLinkedList() {
    DoublyLinkedList<String> testDLL = new DoublyLinkedList<>();
    testDLL.setHead("Hello");
    testDLL.setTail("World");
    testDLL.append("Really");

    assertFalse(
        "testIncludesFromTail_NotInDoublyLinkedList should return: false",
        testDLL.includesFromTail("Big")
    );
  }
}
