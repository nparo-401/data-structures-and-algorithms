package code401challenges;

import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] toBeReversed1 = new int[]{1, 2, 3, 4, 5, 6};
    int[] toBeReversed2 = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
    int[] toBeReversed3 = new int[]{89, 2354, 3546, 23, 10, -923, 823, -12};

    System.out.println(Arrays.toString(reverseArray(toBeReversed1)));
    System.out.println(Arrays.toString(reverseArray(toBeReversed2)));
    System.out.println(Arrays.toString(reverseArray(toBeReversed3)));
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
