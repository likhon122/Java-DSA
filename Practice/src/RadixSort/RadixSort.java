package RadixSort;

public class RadixSort {

    static void printIntArr(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i: arr){
            if(max < i) max = i;
        }
        return max;
    }

    static void getPrefixArr(int[] countArr){
        for (int i = 1; i < countArr.length; i++) countArr[i] += countArr[i-1];
    }

    static void getSuffixArr(int[] countArr){
        for (int i = countArr.length - 2; i >= 0; i--) countArr[i] += countArr[i+1];
    }

    static void countSort(int[] arr, int place, String sortOrder){
        int n = arr.length;
        int[] outputArr = new int[n];
        int[] countArr = new int[10];

        // Find the frequency of the digits
        for (int i: arr ){
            countArr[(i/place)%10]++;
        }

        // Make Prefix sum of the frequency array
        if(sortOrder.equals("ascending")) getPrefixArr(countArr); else getSuffixArr(countArr);

        // Place all the elements in the output array suing prefix sum array
        for (int i = arr.length-1; i >=0; i--){
            int placeIdx = countArr[(arr[i]/place)%10] -1;
            outputArr[placeIdx] = arr[i];
            countArr[(arr[i]/place)%10]--;
        }

        // Place all the output elements in the original array
        for (int i = 0; i < outputArr.length; i++){
            arr[i] = outputArr[i];
        }
    }

    static void radixSort(int[] arr, String sortOrder){
        int max = findMax(arr);
        for (int place = 1; max/place >0; place*=10){
            countSort(arr,place,sortOrder);
        }
    }

    static void main(String[] args) {
        int[] arr = {83,2,1,3,432,234,22,34,2,0};
        System.out.println("Before Sorting");
        printIntArr(arr);
        System.out.println();
        System.out.println("After Sorting");
        radixSort(arr,"ascending");
        printIntArr(arr);
        System.out.println();
        radixSort(arr,"descending");
        printIntArr(arr);
    }
}
