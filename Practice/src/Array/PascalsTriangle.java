package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle {

    public static int[][] pascalsTriangle(int triangleRow){
        int[][] pArr = new int[triangleRow][];

        for (int i = 0; i < triangleRow; i++){
            pArr[i] = new int[i+1];
            for (int j = 0; j < i+1; j++){
                if(j == 0 || j == i){
                    pArr[i][j] = 1;
                    continue;
                }

                pArr[i][j] = pArr[i-1][j] + pArr[i-1][j-1];
            }
        }
        return pArr;
    }


    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many row you want in pascals triangle: ");
        int triangleRow = input.nextInt();

        if(triangleRow <= 0){
            System.out.println("You entered wrong triangle row!");
            return;
        }

        int[][] resultArr = pascalsTriangle(triangleRow);
        System.out.println(Arrays.deepToString(resultArr));

    }
}
