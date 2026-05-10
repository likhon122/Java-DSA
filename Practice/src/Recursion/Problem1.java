package Recursion;

public class Problem1 {
    static void printOneToNNaturalNumbers(int n){
       if(n == 1){
           System.out.print(n + " ");
           return;
       }
       printOneToNNaturalNumbers(n-1);
        System.out.print(n + " ");
    }

    static void printNToOneNaturalNumbers(int n){
       if(n == 1){
           System.out.print(1);
           return;
       }
        System.out.print(n+ " ");
       printNToOneNaturalNumbers(n-1);
    }
    static void main(String[] args) {

//        printOneToNNaturalNumbers(10);
        printNToOneNaturalNumbers(10);
    }
}
