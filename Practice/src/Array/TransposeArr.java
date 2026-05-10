package Array;

import java.util.Arrays;

public class TransposeArr {

    public static int[][] transposeArrWithExtraSpace(int[][] arr, int r, int c){
        int[][] resultArr = new int[c][r];

        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                resultArr[i][j] = arr[j][i];
            }
        }
        return resultArr;
    }

    public static void swapElement(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void transposeArrWithoutExtraSpace(int[][] arr, int r, int c){
        for (int i = 0; i < c; i++){
            for (int j = i; j < r; j++){
                swapElement(arr, i, j);
            }
        }
    }


    static void main(String[] args) {
        int[][] arr = InputArr.inputMultiIntArr();

        if(arr.length == 0){
            System.out.println(Arrays.deepToString(arr));
            return;
        }

//        int[][] resultArr = transposeArrWithExtraSpace(arr, arr.length, arr[0].length);
//        System.out.println(Arrays.deepToString(resultArr));

        // It's just calculate for square matrix not any other matrix means 3X3 matrix not 3X2 matrix
        transposeArrWithoutExtraSpace(arr, arr.length, arr[0].length);
        System.out.println(Arrays.deepToString(arr));
    }
}
