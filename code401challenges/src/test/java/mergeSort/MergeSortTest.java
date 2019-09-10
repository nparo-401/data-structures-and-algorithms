package mergeSort;

import org.junit.Test;

import java.util.Arrays;

import static mergeSort.MergeSort.mergeSort;
import static org.junit.Assert.*;

public class MergeSortTest {
  @Test
  public void testMergeSort_ExpectedPass () {
    int[] testArr = new int[]{9,5,4,8,6,1};
    int[] actual = new int[]{1,4,5,6,8,9};
    
    mergeSort(testArr, testArr.length);
    assertArrayEquals("testMergeSort_ExpectedPass should return:", actual, testArr);
  }
  
  @Test
  public void testMergeSort_ExpectedFail () {
    int[] testArr = new int[]{9,5,4,8,6,1};
    int[] actual = new int[]{9,8,6,5,4,1};
  
    mergeSort(testArr, testArr.length);
    assertFalse("testMergeSort_ExpectedFail should return:", Arrays.equals(testArr, actual));
  }
  
  @Test
  public void testMergeSort_EmptyArr () {
    int[] testArr = new int[]{};
    int[] actual = new int[]{};
    
    mergeSort(testArr, testArr.length);
    assertArrayEquals("testMergeSort_EmptyArr should return:", testArr, actual);
  }
  
  @Test
  public void testMergeSort_DuplicateValues () {
    int[] testArr = new int[]{9,5,4,8,1,6,1};
    int[] actual = new int[]{1,1,4,5,6,8,9};
  
    mergeSort(testArr, testArr.length);
    assertArrayEquals("testMergeSort_ExpectedPass should return:", actual, testArr);
  }
}