package Array;

public class RotateArray {

    public static int[] rotateArr(int[] arr){
        int[] rotatedArr = new int[arr.length];
        int j = arr.length-1;
        for (int i = 0; i <= arr.length/2; i++){
            rotatedArr[i] = arr[j];
            rotatedArr[j] = arr[i];
            j--;
        }
        return rotatedArr;
    }

    private static void swapArrElement(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rotateArrInplace(int[] arr){
        int i = 0, j = arr.length-1;
        while (i < arr.length/2){
            swapArrElement(arr,i,j);
            i++;
            j--;
        }
    }


    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

//       int[] resultArr = rotateArr(arr);
//       PrintArr.printIntArr(resultArr);
        rotateArrInplace(arr);
        PrintArr.printIntArr(arr);
    }
}
