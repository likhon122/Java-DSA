package Array;

public class SortOnOddOrder {

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void sortOnOddOrder(int[] arr){

        int n = arr.length;
        int i = 0, j = n-1;

        while (i < j){
            if(arr[i] % 2 != 0 && arr[j] % 2 == 0){
                swap(arr, i, j);
                i++;
                j--;
            }

            if(arr[i] % 2 == 0){
                i++;
            }

            if(arr[j] % 2 != 0){
                j--;
            }
        }

    }

    static void main(String[] args) {

        int[] arr = InputArr.inputIntArr();

        sortOnOddOrder(arr);

        System.out.println("Your sorted array is: ");
        PrintArr.printIntArr(arr);
    }
}
