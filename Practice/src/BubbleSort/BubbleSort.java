package BubbleSort;

public class BubbleSort {


    public static void sortDescending(int[] arr){
        for (int i = 0; i < arr.length; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    flag = true;
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
            if(!flag){
                return;
            }
        }
    }

    public static void sortAscending(int[] arr){
        for (int i = 0; i < arr.length; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
            System.out.println("Rendering");
            if(!flag){
                return;
            }
        }
    }


    static void main(String[] args) {
        int[] arr = {1,2,6,7};
//        sortAscending(arr);
        sortDescending(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
