package MergeSort;

import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right){
        // Calculate the left side of the array length
        int leftN = mid - left + 1;
        // Calculate the right side of the array length
        int rightN = right - mid;
        // Initialize left side array
        int[] leftArr = new int[leftN];
        // Initialize right side array
        int[] rightArr = new int[rightN];
        // Initialize loop variable to iterate the array
        int i, j, k;
        // Fill left side of the array element
        for (i = 0; i < leftN; i++) leftArr[i] = arr[left+i];
        // Fill left side of the array
        for (j = 0; j < rightN; j++ ) rightArr[j] = arr[mid+1+j];
        // Reset the initialize value
        i =0 ; j = 0; k = left;
        // Iterate left and right side array and set condition if any side of the array go to out of bound then break the loop
        while (i < leftN && j < rightN){
            // Compare both right and left side element i and j th index if j is smaller, then put the j th value in the main array or if small right side element then put this value in the main array.
            if(leftArr[i] < rightArr[j]) arr[k++] = leftArr[i++];
            else arr[k++] = rightArr[j++];
        }
        // If right array is out of bound that means left array is have some extra elements. So iterate this element and put this value in the main array
        while (i < leftN) arr[k++] = leftArr[i++];
        // Or If left array is out of bound that means right array is have some extra elements. So iterate this element and put this value in the main array
        while (j < rightN) arr[k++] = rightArr[j++];
    }

    static void mergeSort(int[] arr, int left, int right){
        // Base case if  left side element length is big or equal then simply return.
        if(left >= right) return;
        int mid = (left + right)/2;
        // Call the left side of the array
        mergeSort(arr,left,mid);
        // Call the right side of the array
        mergeSort(arr,mid+1, right);
        // Merge the two sorted array
        merge(arr,left,mid,right);
    }


   public static void main(String[] args) {
        int[] arr = {2,4,5,1,3};
       System.out.println("Before Sorting");
       for (int i : arr){
           System.out.print(i + " ");
       }
       System.out.println();
       mergeSort(arr,0,arr.length-1);
       System.out.println("After Sorting");
       for (int i : arr){
           System.out.print(i + " ");
       }
    }


}
