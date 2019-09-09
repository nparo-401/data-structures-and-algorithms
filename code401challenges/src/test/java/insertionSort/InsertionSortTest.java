package insertionSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static insertionSort.InsertionSort.insertionSort;

public class InsertionSortTest {
  
  @Test
  public void testInsertionSort_EmptyArray() {
    int[] testArr = new int[]{};
    insertionSort(testArr);
    
    assertArrayEquals(
     "testInsertionSort_EmptyArray should return:",
     new int[]{},
     testArr
    );
  }
  
  @Test
  public void testInsertionSort_InitiallyOutOfOrder() {
    int[] testArr = new int[]{5, 3, 9, 2, 8};
    insertionSort(testArr);
    
    assertArrayEquals(
     "testInsertionSort_InitiallyOutOfOrder should return:",
     new int[]{2, 3, 5, 8, 9},
     testArr
    );
  }
  
  @Test
  public void testInsertionSort_InitiallyInOrder() {
    int[] testArr = new int[]{2, 3, 5, 8, 9};
    insertionSort(testArr);
    
    assertArrayEquals(
     "testInsertionSort_InitiallyInOrder should return:",
     new int[]{2, 3, 5, 8, 9},
     testArr
    );
  }
  
  @Test
  public void testInsertionSort_InitiallyInOrderReversed() {
    int[] testArr = new int[]{9, 8, 5, 3, 2};
    insertionSort(testArr);
    
    assertArrayEquals(
     "testInsertionSort_InitiallyInOrderReversed should return:",
     new int[]{2, 3, 5, 8, 9},
     testArr
    );
  }
  
  @Test
  public void testInsertionSort_WithDuplicateValues() {
    int[] testArr = new int[]{5, 3, 9, 2, 8, 2};
    insertionSort(testArr);
    
    assertArrayEquals(
     "testInsertionSort_WithDuplicateValues should return:",
     new int[]{2, 2, 3, 5, 8, 9},
     testArr
    );
  }
  
  @Test
  public void testInsertionSort_ExpectedFail() {
    int[] testArr = new int[]{5, 3, 9, 2, 8, 2};
    int[] checkArr = new int[]{9, 8, 5, 3, 2, 2};
    insertionSort(testArr);
    
    assertFalse("testInsertionSort_ExpectedFail should return false", Arrays.equals(testArr, checkArr));
  }
}