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
  public void testPrepend_String() {
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
  public void testPrepend_Integer() {
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
  public void testInsertBefore_IntegerEmptyLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.insertBefore(null, 111);

    assertEquals(
        "testInsertBefore_IntegerEmptyLinkedList should return: ",
        "null",
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

  @Test
  public void testInsertAfter_IntegerEmptyLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.insertAfter(null, 111);

    assertEquals(
        "testInsertAfter_IntegerEmptyLinkedList should return: ",
        "null",
        testLL.toString()
    );
  }

  @Test
  public void testKthFromEnd_IntegerInMiddleOfLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(1);
    testLL.append(2);
    testLL.append(3);
    testLL.append(4);
    testLL.append(5);

    assertEquals(
        "testKthFromEnd_IntegerInMiddleOfLinkedList",
        "2",
        testLL.kthFromEnd(3)
    );
  }

  @Test
  public void testKthFromEnd_IntegerIsHeadOfLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(1);
    testLL.append(2);
    testLL.append(3);
    testLL.append(4);
    testLL.append(5);

    assertEquals(
        "testKthFromEnd_IntegerIsHeadOfLinkedList",
        "1",
        testLL.kthFromEnd(4)
    );
  }

  @Test
  public void testKthFromEnd_IntegerIsLastElementOfLinkedList() {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(1);
    testLL.append(2);
    testLL.append(3);
    testLL.append(4);
    testLL.append(5);

    assertEquals(
        "testKthFromEnd_IntegerIsHeadOfLinkedList",
        "5",
        testLL.kthFromEnd(0)
    );
  }

  @Test (expected = IndexOutOfBoundsException.class)
  public void testKthFromEnd_IntegerIsLongerThanLinkedList()  {
    LinkedList<Integer> testLL = new LinkedList<>();
    testLL.setHead(1);
    testLL.append(2);
    testLL.append(3);
    testLL.append(4);
    testLL.append(5);

    testLL.kthFromEnd(6);
  }

  @Test
  public void testMerge_EqualLengthLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    firstList.append(3);
    secondList.setHead(4);
    secondList.append(5);
    secondList.append(6);

    LinkedList testList = LinkedList.merge(firstList, secondList);

    assertEquals(
        "testMerge_EqualLengthLinkedLists should return: ",
        "1 4 2 5 3 6 null",
        testList.toString()
    );
  }

  @Test
  public void testMerge_ShorterFirstLengthLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    secondList.setHead(4);
    secondList.append(5);
    secondList.append(6);

    LinkedList testList = LinkedList.merge(firstList, secondList);

    assertEquals(
        "testMerge_ShorterFirstLengthLinkedLists should return: ",
        "1 4 2 5 6 null",
        testList.toString()
    );
  }

  @Test
  public void testMerge_ShorterSecondLengthLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    firstList.append(3);
    secondList.setHead(4);
    secondList.append(5);

    LinkedList testList = LinkedList.merge(firstList, secondList);

    assertEquals(
        "testMerge_ShorterSecondLengthLinkedLists should return: ",
        "1 4 2 5 3 null",
        testList.toString()
    );
  }

  @Test
  public void testMerge_EmptyFirstLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    secondList.setHead(4);
    secondList.append(5);
    secondList.append(6);

    LinkedList testList = LinkedList.merge(firstList, secondList);

    assertEquals(
        "testMerge_EmptyFirstLinkedLists should return: ",
        "4 5 6 null",
        testList.toString()
    );
  }

  @Test
  public void testMerge_EmptySecondLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    firstList.append(3);

    LinkedList testList = LinkedList.merge(firstList, secondList);

    assertEquals(
        "testMerge_EmptySecondLinkedLists should return: ",
        "1 2 3 null",
        testList.toString()
    );


  }

  @Test
  public void testMerge_EmptyBothLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();

    LinkedList testList = LinkedList.merge(firstList, secondList);

    assertEquals(
        "testMerge_EmptyBothLinkedLists should return: ",
        "null",
        testList.toString()
    );
  }

  @Test
  public void testMergeLists_EqualLengthLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    firstList.append(3);
    secondList.setHead(4);
    secondList.append(5);
    secondList.append(6);

    LinkedList testList = LinkedList.mergeLists(firstList, secondList);

    assertEquals(
        "testMergeLists_EqualLengthLinkedLists should return: ",
        "1 4 2 5 3 6 null",
        testList.toString()
    );
  }

  @Test
  public void testMergeLists_ShorterFirstLengthLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    secondList.setHead(4);
    secondList.append(5);
    secondList.append(6);

    LinkedList testList = LinkedList.mergeLists(firstList, secondList);

    assertEquals(
        "testMergeLists_ShorterFirstLengthLinkedLists should return: ",
        "1 4 2 5 6 null",
        testList.toString()
    );
  }

  @Test
  public void testMergeLists_ShorterSecondLengthLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    firstList.append(3);
    secondList.setHead(4);
    secondList.append(5);

    LinkedList testList = LinkedList.mergeLists(firstList, secondList);

    assertEquals(
        "testMergeLists_ShorterSecondLengthLinkedLists should return: ",
        "1 4 2 5 3 null",
        testList.toString()
    );
  }

  @Test
  public void testMergeLists_EmptyFirstLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    secondList.setHead(4);
    secondList.append(5);
    secondList.append(6);

    LinkedList testList = LinkedList.mergeLists(firstList, secondList);

    assertEquals(
        "testMergeLists_EmptyFirstLinkedLists should return: ",
        "4 5 6 null",
        testList.toString()
    );
  }

  @Test
  public void testMergeLists_EmptySecondLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    firstList.append(3);

    LinkedList testList = LinkedList.mergeLists(firstList, secondList);

    assertEquals(
        "testMergeLists_EmptySecondLinkedLists should return: ",
        "1 2 3 null",
        testList.toString()
    );


  }

  @Test
  public void testMergeLists_EmptyBothLinkedLists() {
    LinkedList<Integer> firstList = new LinkedList<>();
    LinkedList<Integer> secondList = new LinkedList<>();

    LinkedList testList = LinkedList.mergeLists(firstList, secondList);

    assertEquals(
        "testMergeLists_EmptyBothLinkedLists should return: ",
        "null",
        testList.toString()
    );
  }

  @Test
  public void testReverse_NonStatic() {
    LinkedList<Integer> firstList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    firstList.append(3);

    assertEquals(
        "testReverse should return: ",
        "3 2 1 null",
        firstList.reverse().toString()
    );
  }

  @Test
  public void testReverse_NonStaticEmptyList() {
    LinkedList<Integer> firstList = new LinkedList<>();

    assertEquals(
        "testReverse should return: ",
        "null",
        firstList.reverse().toString()
    );
  }

  @Test
  public void testReverse_Static() {
    LinkedList<Integer> firstList = new LinkedList<>();
    firstList.setHead(1);
    firstList.append(2);
    firstList.append(3);

    assertEquals(
        "testReverse should return: ",
        "3 2 1 null",
        LinkedList.reverse(firstList).toString()
    );
  }

  @Test
  public void testReverse_StaticEmptyList() {
    LinkedList<Integer> firstList = new LinkedList<>();

    assertEquals(
        "testReverse should return: ",
        "null",
        LinkedList.reverse(firstList).toString()
    );
  }
}
