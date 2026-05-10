package Array;

import java.util.Arrays;

public class PossibleToPartition {

    public static int totalSumArr(int[] arr){
        int totalSum = 0;
        for (int i : arr) {
            totalSum+=i;
        }
        return totalSum;
    }

    public static boolean partitionPossibleToSum(int[] arr){
        int totalSum = totalSumArr(arr);
        int prefix = 0;
        for (int i = 0; i < arr.length - 1; i++){
            prefix += arr[i];
            int suffix = totalSum - prefix;
            if(prefix == suffix){
                return true;
            }
        }
        return false;
    }


    static void main(String[] args) {
        int[] arr = InputArr.inputIntArr();

        boolean result = partitionPossibleToSum(arr);
        System.out.printf("%s this array to possible partition sum: %b", Arrays.toString(arr), result);

    }
}
