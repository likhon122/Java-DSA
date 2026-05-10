package Array;

public class SortNonDecreasingSquare {

    public static int[] sortNonDecreasingSquare(int[] arr){
        int i = 0,  j = arr.length - 1, k = arr.length-1;
        int[] resultArr = new int[arr.length];
        while (i <= j){
            System.out.println("j = " + j);
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                resultArr[k--] = arr[i] * arr[i];
                i++;
            }else {
                resultArr[k--] = arr[j] * arr[j];
                j--;
            }
        }
        return resultArr;
    }

    static void main(String[] args) {
        int[] arr = InputArr.inputIntArr();

        int[] resultArr = sortNonDecreasingSquare(arr);

        System.out.println("Your sorted array is: ");
        PrintArr.printIntArr(resultArr);
    }
}
