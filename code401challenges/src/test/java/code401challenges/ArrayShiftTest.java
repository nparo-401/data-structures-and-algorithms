package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

  @Test
  public void testInsertShiftArray_desiredPass() {
    int[] testArr = new int[]{2,4,6,8};
    int[] finalArr = new int[]{2,4,5,6,8};
    assertArrayEquals(
        "Shifted array does not equal expected array",
        finalArr,
        ArrayShift.insertShiftArray(testArr, 5));
  }

  @Test
  public void testInsertShiftArray_desiredFail() {
    int[] testArr2 = new int[]{4,8,15,23,42};
    int[] finalArr2 = new int[]{4,8,15,23,42};
    assertArrayEquals(
        "EXPECTED FAILURE: expected not equal to actual array",
        finalArr2,
        ArrayShift.insertShiftArray(testArr2, 16));
  }
}