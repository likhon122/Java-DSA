package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumRange {

    public static int[] prefixSum(int[] arr){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i< arr.length; i++){
            res[i] = arr[i] + res[i-1];
        }
        return res;
    }

    public static void calculatePrefixRange(int[] arr, int first, int last){
        System.out.printf("The sum of %d to %d = %d" , first, last, arr[last] - arr[first-1]);
        System.out.println();
    }

    static void main(String[] args) {
        int[] arr = InputArr.inputArrInOneIndexArr();

        if(arr.length == 0){
            System.out.println("You entered empty list!");
            return;
        }

        int[] prefixSumArr = prefixSum(arr);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many query you want: ");
        int q = input.nextInt();
        while (q-- > 0){
            System.out.print("Enter the fist number of the range: ");
            int first = input.nextInt();
            System.out.print("Enter the last number of the range: ");
            int last = input.nextInt();

            if(first>last){
                System.out.println("You entered the wrong input of range. First range must be grater than last range.");
                return;
            }
            calculatePrefixRange(prefixSumArr, first, last);
        }

    }
}
