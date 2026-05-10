package Recursion;

public class PrintSumOfSubset {

    public static  void printSumOfSubset(int[] arr, int idx, int currentAns){

        if(arr.length <= idx){
            System.out.println(currentAns); // Print the last current ans and return it
            return;
        }
        printSumOfSubset(arr,idx+1, currentAns+arr[idx]); // Add index into the sum
        printSumOfSubset(arr,idx+1, currentAns); // Not add index into the sum
    }

    static void main(String[] args) {
        int[] arr = {2,4,5};
        printSumOfSubset(arr,0,0);
    }
}
