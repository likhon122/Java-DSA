package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MakeSpiralOrderArr {

    public static int[][] makeSpiralOrderArr(int n){
        int[][] matrix = new int[n][n];

        int topRow = 0; int rightColumn = n-1; int bottomRow = n-1; int leftColumn = 0;
        int totalOrder = 0;
        while (totalOrder < n*n){
            // Print top row
            for (int i = leftColumn; i <= rightColumn; i++){
                matrix[topRow][i] = ++totalOrder;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow && totalOrder < n*n; i++){
                matrix[i][bottomRow] = ++totalOrder;}
            rightColumn--;

            for (int i = rightColumn; i >= leftColumn && totalOrder < n*n; i--){
                matrix[bottomRow][i] = ++totalOrder;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow && totalOrder < n*n; i--){
                matrix[i][leftColumn] = ++totalOrder;
            }
            leftColumn++;
        }
        return matrix;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many row you want: ");
        int n = input.nextInt();
        int[][] spMatrix = makeSpiralOrderArr(n);

        for (int[] matrix : spMatrix) {
            for (int j = 0; j < spMatrix.length; j++) {
                System.out.print(matrix[j] + " ");
                if(spMatrix.length-1 == j){
                    System.out.println();
                }
            }
        }

    }
}
