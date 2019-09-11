# Quick Sort
#### Code
* [Quick Sort](QuickSort.java)
* [Merge Sort Test](../../../test/java/quickSort/QuickSortTest.java)

#### Description
The quick sort takes in an array and utilizes a pivot point to sort over the various items. It sorts the items around the pivot and breaks the array down into smaller arrays where the items move around that pivot point to be sorted. This is the most effective array from larger data sets.

The quick sort will use three methods:
* `quickSort(int[] arr, int begin, int end)`
* `partition(int[] arr, int begin, int end)`
* `swap(int[] arr, int i, int j)`

#### Effectiveness
Time and Space:
* Time: O(n log(n))
* Space: O(log(n))

The quick sort algorithm is the most efficient of the three - insertion, merge, and quick. This allows the quick sort algorithm to be the best on large data sets.

## Learning Objectives
* Understand the problem domain - input, expected changes, output
* Understand the algorithm
* Apply the algorithm to Pseudocode
* Understand the time and space complexity

## Visual
![quick sort](https://upload.wikimedia.org/wikipedia/commons/9/9c/Quicksort-example.gif)

### Pseudocode / Algorithm
```
CREATE METHOD quickSort(int[] arr, int begin, int end)
  IF begin < end
    ASSIGN partitionIndex <- partition(arr, begin, end)
    RECURSIVE call quickSort(arr, begin, partitionIndex - 1)
    RECURSIVE call quickSort(arr, partitionIndex + 1, end)
  END IF
END METHOD
```
```
CREATE METHOD partition(int[] arr, int begin, int end)
  ASSIGN pivot <- arr[end]
  ASSIGN i <- begin - 1
  
  FOR j = begin to j < end
    IF arr[j] <= pivot
      SET i++
      CALL swap(arr, i, j)
    END IF
  END FOR
  CALL swap(arr, i + 1, end)
  RETURN i + 1
END METHOD
```
```
CREATE METHOD swap(int[] arr, int i, int j)
  ASSIGN temp <- arr[i]
  SET arr[i] <- arr[j]
  SET arr[j] <- temp
END METHOD
```

## Readings and References
### Watch
[![Quick Sort](assets/video-image.png)](https://www.youtube.com/watch?v=Fiot5yuwPAg)

### Read
* [Baeldung Quick Sort](https://www.baeldung.com/java-quicksort)
* [Geeks for Geeks Quick Sort](https://www.geeksforgeeks.org/quick-sort/)
