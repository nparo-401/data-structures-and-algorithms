package code401challenges;

public class BinarySearch {
  public static int binarySearch(int[] arr, int n) {
    int begin = 0;
    int end = arr.length - 1;

    while (begin <= end) {
      int mid = (begin + end) / 2;
      if (arr[mid] == n) return mid;
      else if (arr[mid] < n) begin = mid + 1;
      else end = mid - 1;
    }

    return -1;
  }
}
