package mergeSort;

//sourced: https://www.baeldung.com/java-merge-sort
public class MergeSort {
  public static void mergeSort(int[] arr, int len) {
    if (len < 2) {
      return;
    }
    int mid = len / 2;
    int[] left = new int[mid];
    int[] right = new int[len - mid];
  
    System.arraycopy(arr, 0, left, 0, mid);
    System.arraycopy(arr, mid, right, 0, len - mid);
    
    mergeSort(left, mid);
    mergeSort(right, len-mid);
    merge(arr, left, right, mid, len-mid);
  }
  
  private static void merge(int[] arr, int[] left, int[] right, int l, int r) {
    int i = 0;
    int j = 0;
    int k = 0;
    
    while (i < l && j < r) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }
    while (i < l) {
      arr[k++] = left[i++];
    }
    while (j < r) {
      arr[k++] = right[j++];
    }
  }
}
