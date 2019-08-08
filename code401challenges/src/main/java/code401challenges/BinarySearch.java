package code401challenges;

public class BinarySearch {
  public static int binarySearch(int[] arr, int n) {
    int begin = 0;
    int end = arr.length - 1;

    while (begin <= end) {
      int mid = (int)Math.ceil(((double)begin + (double)end) / 2);
      if (arr[mid] == n) return mid;
      else if (arr[mid] < n) begin = mid + 1;
      else if (arr[mid] > n) end = mid - 1;
    }

    return -1;
  }
}
