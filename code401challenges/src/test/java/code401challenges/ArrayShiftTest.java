package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

  @Test
  public void testInsertShiftArray_EvenLengthArray() {
    int[] testArr = new int[]{2,4,6,8};
    int[] finalArr = new int[]{2,4,5,6,8};

    assertArrayEquals(
        "Shifted array does not equal expected array",
        finalArr,
        ArrayShift.insertShiftArray(testArr, 5)
    );
  }

  @Test
  public void testInsertShiftArray_OddLengthArray() {
    int[] testArr = new int[]{4,8,15,23,42};
    int[] finalArr = new int[]{4,8,15,16,23,42};

    assertArrayEquals(
        "Shifted array does not equal expected array",
        finalArr,
        ArrayShift.insertShiftArray(testArr, 16)
    );
  }

  @Test
  public void testInsertShiftArray_ZeroLengthArray() {
    int[] testArr = new int[]{};
    int[] finalArr = new int[]{0};

    assertArrayEquals(
        "Shifted array does not equal expected array",
        finalArr,
        ArrayShift.insertShiftArray(testArr, 0)
    );
  }

  @Test
  public void testInsertShiftArray_ExpectedFail() {
    int[] testArr = new int[]{};

    assertNotEquals(
        "Length should not match",
        0,
        ArrayShift.insertShiftArray(testArr, 0).length
    );
  }
}
