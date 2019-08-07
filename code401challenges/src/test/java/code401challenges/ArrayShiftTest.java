package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

  @Test
  public void testInsertShiftArray() {
    int[] testArr = new int[]{2,4,6,8};
    int[] testArr2 = new int[]{4,8,15,23,42};
    int[] finalArr = new int[]{2,4,5,6,8};
    int[] finalArr2 = new int[]{4,8,15,16,23,42};
    assertArrayEquals("shifted array does not equal expected array", finalArr, ArrayShift.insertShiftArray(testArr, 5));
    assertArrayEquals("shifted array does not equal expected array", finalArr2, ArrayShift.insertShiftArray(testArr2,
        16));
  }
}