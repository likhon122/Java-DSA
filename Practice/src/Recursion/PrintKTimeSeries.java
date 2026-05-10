package Recursion;

public class PrintKTimeSeries {

    public static void printKTimeSeries(int num, int k){

        if(k < 1){
            return;
        }

        printKTimeSeries(num, k-1);
        num *= k;
        System.out.print(num + " ");



    }

    static void main(String[] args) {
        printKTimeSeries(12,5);
    }
}
