package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

  @Test
  public void testInsertShiftArray_desiredPass() {
    int[] testArr = new int[]{2,4,6,8};
    int[] testArr2 = new int[]{4,8,15,23,42};
    int[] testArr3 = new int[]{};
    int[] finalArr = new int[]{2,4,5,6,8};
    int[] finalArr2 = new int[]{4,8,15,16,23,42};
    int[] finalArr3 = new int[]{0};

    assertArrayEquals(
        "Shifted array does not equal expected array",
        finalArr,
        ArrayShift.insertShiftArray(testArr, 5)
    );

    assertArrayEquals(
        "Shifted array does not equal expected array",
        finalArr2,
        ArrayShift.insertShiftArray(testArr2, 16)
    );

    assertArrayEquals(
        "Shifted array does not equal expected array",
        finalArr3,
        ArrayShift.insertShiftArray(testArr3, 0)
    );

    // Expected Failure
    assertNotEquals(
        "Length does not match",
        testArr3,
        ArrayShift.insertShiftArray(testArr3, 0)
    );
  }
}