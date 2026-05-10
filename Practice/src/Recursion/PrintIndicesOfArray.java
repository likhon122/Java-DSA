package Recursion;

import java.util.Scanner;

public class PrintIndicesOfArray {

    public static void printIndicesOrArray(int[] arr, int value, int index){
        if(arr.length <= index){
            return;
        }

        if(arr[index] == value){
            System.out.print(index + " ");
        }
        printIndicesOrArray(arr,value, index + 1);
    }

    static void main(String[] args) {
        int[] arr = {1,1,1,1,12,3,4,5,7,10,10};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int x = input.nextInt();
        System.out.print("Indices is: ");
        printIndicesOrArray(arr,x,0);
    }
}
