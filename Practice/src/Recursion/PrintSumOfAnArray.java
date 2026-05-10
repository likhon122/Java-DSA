package Recursion;

import java.util.Arrays;

public class PrintSumOfAnArray {

    public static int sumOfAnArray(int[] arr, int index){
        // Base Case
        if(arr.length == index){
            return 0;
        }
        int smallSum = sumOfAnArray(arr, index+1);
        return smallSum + arr[index];
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        System.out.println("Sum of " + Arrays.toString(arr) + " this array is: " + sumOfAnArray(arr,0));
    }
}
