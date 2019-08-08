package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

  @Test
  public void testBinarySearch_EvenLengthArray() {
    int[] testArr = new int[]{1,2,3,4};
    assertEquals(
        "EvenLengthArray should return an index of 3",
        3,
        BinarySearch.binarySearch(testArr, 4)
    );
  }

  @Test
  public void testBinarySearch_OddLengthArray() {
    int[] testArr = new int[]{1,2,3,4,5};
    assertEquals(
        "OddLengthArray should return an index of 1",
        1,
        BinarySearch.binarySearch(testArr, 2)
    );
  }

  @Test
  public void testBinarySearch_ZeroLengthArray() {
    int[] testArr = new int[]{};
    assertEquals(
        "ZeroLengthArray should return -1",
        -1,
        BinarySearch.binarySearch(testArr, 1)
    );
  }

  @Test
  public void testBinarySearch_SearchKeyGreaterThanInArray() {
    int[] testArr = new int[]{1,2,3,4};
    assertEquals(
        "SearchKeyGraterThanInArray should return -1",
        -1,
        BinarySearch.binarySearch(testArr, 9)
    );
  }

  @Test
  public void testBinarySearch_SearchKeyLessThanInArray() {
    int[] testArr = new int[]{1,2,3,4,5};
    assertEquals(
        "SearchKeyLessThanInArray should return -1",
        -1,
        BinarySearch.binarySearch(testArr, 0)
    );
  }

  @Test
  public void testBinarySearch_FirstMidValue() {
    int[] testArr = new int[]{1,2,3,4,5};
    assertEquals(
        "FirstMidValue should return an index of 2",
        2,
        BinarySearch.binarySearch(testArr, 3)
    );
  }
}
