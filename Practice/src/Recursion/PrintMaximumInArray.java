package Recursion;

public class PrintMaximumInArray {

    public static int getMaximumInArray(int[] arr, int index){
        // Base Case
        if(arr.length -1 == index){
            return arr[arr.length-1];
        }
        // Recursive Work
        int max = getMaximumInArray(arr, index+1);
        // Self work
        return Math.max(arr[index], max);
    }

    static void main(String[] args) {
        int[] arr = {1,4,10,5,6,7};
        System.out.println("Maximum of the array is: " + getMaximumInArray(arr,0));
    }
}
