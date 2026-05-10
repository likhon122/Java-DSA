package Recursion;

public class CalculateFactorial {

    public static int factorial(int n){

        if(n == 1) return 1;

        return n * factorial(n-1);
    }

    static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
