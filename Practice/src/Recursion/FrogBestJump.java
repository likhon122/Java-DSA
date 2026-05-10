package Recursion;

public class FrogBestJump {

    public static int best(int[] arr, int idx){
        if(idx == arr.length -1) return 0;
        int option1 = best(arr,idx+1) + Math.abs(arr[idx+1] - arr[idx]);
        if(idx == arr.length-2) return option1;
        int option2 = best(arr,idx+2) + Math.abs(arr[idx+2] - arr[idx]);
        return Math.min(option1, option2);
    }


    static void main(String[] args) {
        int[] arr = {10,30,40,20};
        System.out.println(best(arr,0));
    }
}
