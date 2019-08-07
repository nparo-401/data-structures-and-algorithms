package code401challenges;

public class ArrayShift {
  public static int[] insertShiftArray(int[] arrToBeShifted, int valToBeAdded){
    int len = arrToBeShifted.length + 1;
    int middle = len / 2;
    int[] newArr = new int[len];

    for (int i = 0; i < len; i++) {
      if (i < middle) newArr[i] = arrToBeShifted[i];
      else if(i == middle) newArr[i] = valToBeAdded;
      else newArr[i] = arrToBeShifted[i - 1];
    }

    return newArr;
  }
}
