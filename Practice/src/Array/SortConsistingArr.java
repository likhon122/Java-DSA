package Array;

public class SortConsistingArr {

    public static void swapElement(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortConsistingArr(int[] arr){
        int n = arr.length;
        int i = 0, j = n-1;

        while (i<j){
            if(arr[i] == 1 && arr[j] == 0){
                swapElement(arr, i, j);
                i++;
                j--;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
    }

    static void main(String[] args) {
        int[] arr = InputArr.inputIntArr();

        sortConsistingArr(arr);

        System.out.println("Your sorted array is: ");
        PrintArr.printIntArr(arr);
    }

}
