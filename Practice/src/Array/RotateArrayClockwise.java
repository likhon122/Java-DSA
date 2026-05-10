package Array;

import java.util.Arrays;

public class RotateArrayClockwise {

    public static int[][] rotateArrayClockwiseWithExtraSpace(int[][] arr, int r){
        int[][] resultArr = new int[r][r];
        int k = r-1;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < r; j++){
                resultArr[j][k] = arr[i][j];
            }
            k--;
        }
        return  resultArr;
    }

    public static void rotateArray(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void transposeArr(int[][] matrix, int n){
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void rotateArrayClockwiseWithoutExtraSpace(int[][] matrix, int n){

        transposeArr(matrix,n);
        for (int i = 0; i < n; i++){
            rotateArray(matrix[i]);
        }
    }

    static void main(String[] args) {
        int[][] arr = InputArr.inputMultiIntArr();

        if(arr.length == 0){
            System.out.println(Arrays.deepToString(arr));
            return;
        }

//        int[][] resultArr = rotateArrayClockwiseWithExtraSpace(arr, arr.length);
//        System.out.println(Arrays.deepToString(resultArr));

        rotateArrayClockwiseWithoutExtraSpace(arr, arr.length);
        System.out.println(Arrays.deepToString(arr));
        // It's just calculate for square matrix not any other matrix means 3X3 matrix not 3X2 matrix
//        transposeArrWithoutExtraSpace(arr, arr.length, arr[0].length);
//        System.out.println(Arrays.deepToString(arr));
    }
}
