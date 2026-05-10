package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAnElementOfArray {

    public static boolean searchInArray(int[] arr, int value, int index){
        // Base Case
        if(arr.length == index){
            return false;
        }

        // Recursive Work
        boolean subResult = searchInArray(arr, value, index+1);
        // Self work
        if(subResult){
            return true;
        }else {
            return arr[index] == value;
        }
    }

    public static ArrayList<Integer> searchInArrayAndReturnArrayList(int[] arr, int value, int index){
        if(index < 0){
            return new ArrayList<>();
        }

        ArrayList<Integer> list = searchInArrayAndReturnArrayList(arr,value,index - 1);
        if(arr[index] == value){
            list.add(index);
        }
        return list;

    }


    public static int searchInArrayAndReturnIndex(int[] arr, int value, int index){
        if(arr.length <= index){
            return -1;
        }
        if(arr[index] == value) return index;
        return searchInArrayAndReturnIndex(arr,value,index+1);
    }

    static void main(String[] args) {
        int[] arr = {1,1,2,3,2,1,2,3,3,4,2,9};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int num = input.nextInt();
//        System.out.println("Search found: " + searchInArray(arr,num,0));
//        System.out.println(searchInArrayAndReturnIndex(arr,num,0));
        System.out.println(searchInArrayAndReturnArrayList(arr,num,arr.length-1));
    }
}
