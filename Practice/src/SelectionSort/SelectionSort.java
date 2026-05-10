package SelectionSort;

public class SelectionSort {

    static void sortDescendingOrder(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n-1; i++){
            int maxIndex = i;
            for (int j = i+1; j < n; j++){
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                arr[i] = arr[maxIndex] + arr[i];
                arr[maxIndex] = arr[i] - arr[maxIndex];
                arr[i] = arr[i] - arr[maxIndex];
            }
        }
    }

    static void sortAscendingOrder(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {1,2,4,5,6,43,224,3,234,5,643,3,45,0};
//        sortAscendingOrder(arr);
        sortDescendingOrder(arr);
        for (int i : arr) {
            System.out.print(i +  " ");
        }
    }

}
