package Recursion;

public class IsSortedArray {

    public static boolean isSorted(int[] arr, int index){
        // Base Case
        if(arr.length  -1 == index){
            return true;
        }
        // Self Work
        if(arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);

    }

    static void main(String[] args) {
        int[] arr = {1,0};
        System.out.println(isSorted(arr,0));
    }
}
