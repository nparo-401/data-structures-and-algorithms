import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] toBeReversed = new int[]{1,2,3,4,5};

    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }

  public static int[] reverseArray(int[] arr) {
    int len = arr.length;
    int[] reversedArr = new int[len];

    for(int i=0; i < len; i++){
      reversedArr[(len - 1) - i] = arr[i];
    }

    return reversedArr;
  }
}
