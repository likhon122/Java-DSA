package CountSort;

import java.util.Arrays;

public class CountSort {

    static void printIntArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void sortAscendingOrder(int[] arr) {
        int n = arr.length;
        int[] outputArr = new int[n];
        // Find the largest number in the array
        int largestNum = Integer.MIN_VALUE;
        for (int j : arr) {
            if (largestNum < j) {
                largestNum = j;
            }
        }

        // Make array of length largest Number
        int[] countArr = new int[largestNum + 1];
        // Get frequency of every element in the main array
        for (int j : arr) {
            countArr[j]++;
        }

        // Now get the prefix sum of the countArr
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }

        // Now place the all elements in the output array using the prefix sum array
        for (int i = arr.length - 1; i >= 0; i--) {
            int placingIndex = countArr[arr[i]] - 1;
            outputArr[placingIndex] = arr[i];
            countArr[arr[i]]--;
        }

        // Copy all the elements in the main array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = outputArr[i];
        }
    }

    static void sortDescendingOrder(int[] arr) {
        int n = arr.length;
        int[] outputArr = new int[n];

        // Find the largest number in the main array
        int largestNum = Integer.MIN_VALUE;
        for (int i : arr) {
            if (largestNum < i) largestNum = i;
        }

        // Make largest number size + 1 of array
        int[] countArr = new int[largestNum + 1];
        // Find the frequency of the main elements
        for (int i : arr) {
            countArr[i]++;
        }

        // Find the suffix sum of the countArr
        for (int i = countArr.length - 2; i >= 0; i--) {
            countArr[i] += countArr[i + 1];
        }

        // Place all the elements in output array using sufix sum
        for (int i = n - 1; i >= 0; i--) {
            int placeIdx = countArr[arr[i]] - 1;
            outputArr[placeIdx] = arr[i];
            countArr[arr[i]]--;
        }

        // Copy all the elements in the main array
        for (int i = 0; i < outputArr.length; i++) {
            arr[i] = outputArr[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 4, 6, 8, 32, 34, 56, 3, 2, 0, 1};
        System.out.println("Before Sorting");
        printIntArr(arr);
        System.out.println();
        System.out.println("After Sorting");
//        sortAscendingOrder(arr);
        sortDescendingOrder(arr);
        printIntArr(arr);
    }

}
