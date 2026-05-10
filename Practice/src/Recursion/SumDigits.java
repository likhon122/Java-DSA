package Recursion;

public class SumDigits {

    public static int sumDigits(int n){
        if(n/10 == 0){
            return n;
        }
        int sum = sumDigits(n/10);
        return n%10 + sum;
    }

    static void main(String[] args) {
        System.out.println(sumDigits(1540));
    }
}
