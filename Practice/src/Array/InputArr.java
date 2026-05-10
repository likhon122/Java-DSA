package Array;

import java.util.Scanner;

public class InputArr {
    public static int[] inputIntArr(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element do you want in array: ");
        int arrLength = input.nextInt();

        if(arrLength <0){
            return new int[0];
        }

        int[] arr = new int[arrLength];

        for (int i = 0; i<arrLength; i++){
            System.out.printf("Enter %d no element: ", i+1);
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static int[] inputArrInOneIndexArr(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element do you want in list: ");
        int arrLength = input.nextInt();

        if(arrLength <= 0){
            return new int[0];
        }

        int[] arr = new int[arrLength + 1];

        for (int i = 1; i <= arrLength; i++){
            System.out.printf("Enter %d no element: ", i);
            arr[i] = input.nextInt();
        }

        return arr;
    }


    public static int[][] inputMultiIntArr(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many row you want: ");
        int row = input.nextInt();
        System.out.print("Enter how many column you want: ");
        int column = input.nextInt();

        if(row < 0 || column < 0){
            return new int[0][0];
        }

        int[][] res = new int[row][column];

        for (int i = 0 ; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.printf("Enter %d row %d no column element: ", i+1, j+1);
                int element = input.nextInt();
                res[i][j] = element;
            }
        }

        return res;
    }
}
