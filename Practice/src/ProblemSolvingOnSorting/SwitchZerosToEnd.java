package ProblemSolvingOnSorting;


// Given an integer array arr, move all 0's to the end of the while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array
// Input: 0 5 0 3 42
// Output: 5 3 42 0 0

public class SwitchZerosToEnd {


    static void moveToZerosEnd(int[] arr){
       int n = arr.length;
        for (int i = 0; i < n; i++){
            boolean flag = false;
            for (int j = 0; j < n-1-i; j++){
                if(arr[j] == 0 && arr[j+1] != 0){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if(!flag){
                return;
            }

        }
    }


    static void main(String[] args) {
        int[] arr = {0,5,0,3,42};
        moveToZerosEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ") ;
        }
    }






}
