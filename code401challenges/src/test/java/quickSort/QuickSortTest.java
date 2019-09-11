package quickSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static quickSort.QuickSort.quickSort;

public class QuickSortTest {
  @Test
  public void testQuickSort_UniqueValuesInArray () {
    int[] testArr = new int[]{1,4,8,5,2,3};
    int[] expected = new int[]{1,2,3,4,5,8};
    quickSort(testArr, 0, testArr.length - 1);
    
    assertArrayEquals("testQuickSort_UniqueValuesInArray should return:", expected, testArr);
  }
  
  @Test
  public void testQuickSort_DuplicateValuesInArray () {
    int[] testArr = new int[]{1,4,8,1,5,2,3};
    int[] expected = new int[]{1,1,2,3,4,5,8};
    quickSort(testArr, 0, testArr.length - 1);
    
    assertArrayEquals("testQuickSort_DuplicateValuesInArray should return:", expected, testArr);
  }
  
  @Test
  public void testQuickSort_ExpectedFail () {
    int[] testArr = new int[]{1,4,8,5,2,3};
    int[] expected = new int[]{8,5,4,3,2,1};
    quickSort(testArr, 0, testArr.length - 1);
    
    assertFalse("testQuickSort_ExpectedFail should return:", Arrays.equals(expected, testArr));
  }
  
  @Test
  public void testQuickSort_EmptyArray () {
    int[] testArr = new int[]{};
    int[] expected = new int[]{};
    quickSort(testArr, 0, testArr.length - 1);
    
    assertArrayEquals("testQuickSort_EmptyArray should return:", expected, testArr);
  }
}