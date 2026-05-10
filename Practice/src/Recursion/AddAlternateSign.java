package Recursion;

public class AddAlternateSign {


    public static int findSumAlternateSign(int n){
        if(n == 0) return n;
        int result = findSumAlternateSign(n-1);
        if(n % 2 == 0) return result - n;
        return result + n;
    }

    static void main(String[] args) {
        System.out.println(findSumAlternateSign(5));
    }
}
