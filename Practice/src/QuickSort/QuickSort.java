package QuickSort;

import java.util.Arrays;

public class QuickSort {

    static void printArr(int[] arr) {
        for (int value : arr) System.out.print(value + " ");
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static int partition(int[] arr, int startIdx, int endIdx) {
//      At first select the pivot element Then set the pivot element actual correct position. Then move the all
//      small element in pivot element left and move all the bigger element in right side

        int pivotElement = arr[startIdx];
        // Let's start to set the povit element his correct position

        // let's assume that pivot Element correct position is startIdx
        int count = 0;
        // Iterate the startIdx+1 to endIdx
        for (int i = startIdx + 1; i <= endIdx; i++) {
            // If any element is less than pivotElement then change the pivotElement position
            if (arr[i] < pivotElement) {
                count++;
            }
        }
        int pivotElementIdx = startIdx + count;
        // If any change the pivot element position then swap the correct position
        System.out.println("StartIdx " + startIdx + " pivotElement Idx " + pivotElementIdx);
        swap(arr, startIdx, pivotElementIdx);

        // Now set the all smaller elements on the left side and set all the bigger element on the right side
        // Let's assume that i and j is startIdx and endIdx
        int i = startIdx;
        int j = endIdx;
        // Iterate the while loop i is less than pivotElement and j is grater than pivotIndex.  if any i th element
        // is bigger than povitElement then stop increase the index and if any j th element is smaller than
        // povitElement then stop decreasing the j th index and lastly swap each other
        while (i < pivotElementIdx && j > pivotElementIdx) {
            while (arr[i] <= pivotElement) i++;
            while (arr[j] > pivotElement) j--;
            if (i < pivotElementIdx && j > pivotElementIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        // Finally return the povitElementIndex
        return pivotElementIdx;
    }

    static void quickSort(int[] arr, int startIdx, int endIdx) {
        // Base Case -> If startIdx is grater than or equal endIdx then simply return it becouse of single element is
        // already sorted
        if (startIdx >= endIdx) return;
        // Find the povit element and sorted two partition
        int pivot = partition(arr, startIdx, endIdx);
        // Call recursive to first left side of pivot partition
        quickSort(arr, startIdx, pivot - 1);
        // Call recursive to right side of pivot partition
        quickSort(arr, pivot + 1, endIdx);
    }

    static int partitionDescending(int[] arr, int firstIdx, int endIdx) {
        int pivotElement = arr[firstIdx];
        int count = 0;
        for (int i = firstIdx + 1; i <= endIdx; i++) {
            if (arr[i] > pivotElement) {
                count++;
            }
        }
        int pivotElementIdx = count + firstIdx;
        swap(arr, firstIdx, pivotElementIdx);
        System.out.println(pivotElementIdx + " " + Arrays.toString(arr));
        int i = firstIdx;
        int j = endIdx;

        while (i < pivotElementIdx && j > pivotElementIdx) {
            while (arr[i] > pivotElement) i++;
            while (arr[j] <= pivotElement) j--;
            if (i < pivotElementIdx && j > pivotElementIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotElementIdx;

    }

    static void quickSortDescendingOrder(int[] arr, int firstIdx, int endIdx) {
        if (firstIdx >= endIdx) return;
        int pivot = partitionDescending(arr, firstIdx, endIdx);
        quickSortDescendingOrder(arr, firstIdx, pivot - 1);
        quickSortDescendingOrder(arr, pivot + 1, endIdx);
    }

    public static void main(String[] args) {
        int[] arr = {3, 24, 5, 74, 4, 83, 2, 4};
        System.out.println("Before Sort");
        printArr(arr);
        System.out.println();
        quickSortDescendingOrder(arr, 0, arr.length - 1);
        System.out.println("After sort");
        printArr(arr);
    }
}
