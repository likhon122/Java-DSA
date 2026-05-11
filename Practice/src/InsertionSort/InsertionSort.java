package InsertionSort;

public class InsertionSort {

    static void sortDescendingOrder(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int j = i;
            while (j > 0 && arr[j] > arr[j-1]) {
                arr[j] = arr[j] + arr[j-1];
                arr[j-1] = arr[j] - arr[j-1];
                arr[j] = arr[j] - arr[j-1];
                j--;
            }
        }
    }


    static void sortAscendingOrder(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                arr[j] = arr[j] + arr[j-1];
                arr[j-1] = arr[j] - arr[j-1];
                arr[j] = arr[j] - arr[j-1];
                j--;
            };
        }
    }


    static void main(String[] args) {
        int[] arr = {12,35,43,3,3,23,24,53,64,2323,6,32,5,6,2};
//        sortAscendingOrder(arr);
        sortDescendingOrder(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }



}
