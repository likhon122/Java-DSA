package Array;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class SumOverColumRow {


    public static void printArr(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }


    public static void prefixSumRowWise(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr[i].length; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
    }

    public static void prefixSumColumnWise(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++){
                arr[j][i] += arr[j-1][i];
            }
        }
    }


    public static int sumOverColumRow(int[][] arr, int l1, int r1, int l2, int r2){
        prefixSumRowWise(arr);
       prefixSumColumnWise(arr);
       if(l1 == 0 && r1 == 0){
           return arr[l2][r2];
       }


       int up = arr[l1-1][r2];
       int left = arr[l2][r1-1];
       int duplicate = arr[l1-1][r1-1];
       int totalWithoutDuplicate = arr[l2][r2] - (up + left);
       return (totalWithoutDuplicate + duplicate);
    }


    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] arr = InputArr.inputMultiIntArr();

        printArr(arr);
        System.out.println();

        System.out.print("Enter the coordinate of l1: ");
        int l1 = input.nextInt();
        System.out.print("Enter the coordinate of r1: ");
        int r1 = input.nextInt();
        System.out.print("Enter the coordinate of r2: ");
        int l2 = input.nextInt();
        System.out.print("Enter the coordinate of r2: ");
        int r2 = input.nextInt();

        int sum = sumOverColumRow(arr, l1, r1, l2, r2);

        System.out.println("Sum of the l1 r1 and l2 r2 is: " + sum);

    }
}
