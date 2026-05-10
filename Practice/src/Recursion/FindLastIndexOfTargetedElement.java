package Recursion;

import java.util.Scanner;

public class FindLastIndexOfTargetedElement {

    public static int targetLastElementIndex(int[] arr,int element, int index){

        if(arr.length <= index)return -1;

        int subIndex = targetLastElementIndex(arr,element,index + 1);
        return subIndex >= 0 ? subIndex : arr[index] == element ? index : -1;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,4,3,2,1};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your element: ");
        int element = input.nextInt();

        int index = targetLastElementIndex(arr, element, 0);
        if(index == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Targeted element last index is: " + index);
        }
    }
}
