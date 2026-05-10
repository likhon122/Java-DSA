package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTwoDimensionalArrMulti {

    public static int[][] multiTwoDimensionalArr(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){

        if(c1 != r2){
            System.out.println("You entered wrong Matrix. Please enter correct matrix. Correct matrix is 'First matrix column is equal second matrix row'");
            return new int[0][0];
        }
        int[][] multiArr = new int[r1][c2];
        for (int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                for (int k = 0; k < r2; k++){
                    multiArr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return multiArr;

    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first Matrix.");
        int[][] arr1 = InputArr.inputMultiIntArr();
        System.out.println("Now enter your second Matrix.");
        int[][] arr2 = InputArr.inputMultiIntArr();

        int[][] ansArr = multiTwoDimensionalArr(arr1, arr1.length, arr1[0].length, arr2, arr2.length, arr2[0].length);

        System.out.println(Arrays.deepToString(ansArr));
    }
}
