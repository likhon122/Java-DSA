package Array;

public class PrintSpiralMatrix {

    static void printSpiralMatrix(int[][] matrix, int r, int c){
        // Define the variables
        int leftColum = 0;
        int rightColum = c-1;
        int bottomRow = r-1;
        int topRow = 0;
        int totalPrint = 0;

        while (totalPrint < r * c){
            // Print TopRow
            for (int i = leftColum; i <= rightColum; i++){
                System.out.print(matrix[leftColum][i] + " ");
                totalPrint++;
            }
            topRow++;

            // Print Right Column
            for (int i = topRow; i <= bottomRow && totalPrint < r * c; i++){
                System.out.print(matrix[i][rightColum] + " ");
                totalPrint++;
            }
            rightColum--;

            // Print Bottom row
            for (int i = rightColum; i >= leftColum && totalPrint < r * c; i--){
                System.out.print(matrix[bottomRow][i] + " ");
                totalPrint++;
            }
            bottomRow--;

            // Print Left column
            for (int i = bottomRow; i >= topRow && totalPrint < r * c; i--){
                System.out.print(matrix[i][leftColum] + " ");
                totalPrint++;
            }
            leftColum++;

        }
    }


    static void main(String[] args) {

        int[][] matrix = InputArr.inputMultiIntArr();
        printSpiralMatrix(matrix, matrix.length, matrix[0].length);

    }
}
