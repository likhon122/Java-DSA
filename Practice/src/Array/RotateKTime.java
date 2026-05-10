package Array;

import java.util.Scanner;

public class RotateKTime {

    public static int[] rotateKthTime(int[] arr,int k){
        int n = arr.length;
        k%=n;
        int[] newArr = new int[n];
        int j=0;
        // Rotate the Last elements
        for (int i = n-k; i<n; i++){
            newArr[j++] = arr[i];
        }

        // Concat the first elements in array
        for (int i = 0; i<n-k; i++){
            newArr[j++] = arr[i];
        }
        return newArr;
    }
    public static void swapArr(int[] arr, int i, int j){
        arr[i] = arr[i]+ arr[j]; // arr[i] = 5+3 -> 8
        arr[j] = arr[i]-arr[j]; // arr[j]= 8-3 -> 5
        arr[i] = arr[i]-arr[j]; // arr[i]= 8-5 -> 3
    }

    public static void rotateArrInplace(int[] arr, int st, int end){
        for (int i = st; i < end; i++){
            swapArr(arr, i, end);
            end--;
        }
    }

    public static void rotateKTimeInplace(int[] arr, int k){
        int n = arr.length;
        k%=n;
        rotateArrInplace(arr, n-k, n-1);
        rotateArrInplace(arr, 0, n-k-1);
        rotateArrInplace(arr,0,n-1);
    }


    static void main(String[] args) {
        int[] arr = InputArr.inputIntArr();
//        int[] arr = {1,2,3,4,5,6};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = input.nextInt();
//        int k = 3;
//        int[] result = rotateKthTime(arr, k);
//        PrintArr.printIntArr(result);
        rotateKTimeInplace(arr,k);
        PrintArr.printIntArr(arr);
    }
}
