package Array;

import java.util.Arrays;

public class PrefixSum {

    public static void prefixSumArr(int[] arr){
        for (int i = 1; i< arr.length; i++ ){
            arr[i] = arr[i-1] + arr[i];
        }
    }

    static void main(String[] args) {
        int[] arr = InputArr.inputIntArr();

        prefixSumArr(arr);

        System.out.println(Arrays.toString(arr));
    }
}
