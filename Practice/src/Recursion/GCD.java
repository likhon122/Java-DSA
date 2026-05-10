package Recursion;

import java.util.Scanner;

public class GCD {

    static int gcd(int x, int y){
        if(y == 0){
            return x;
        }

        return gcd(y, x%y);
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        int x = input.nextInt();
        System.out.print("Enter the value or Y: ");
        int y = input.nextInt();
        System.out.println("GCD is: " + gcd(x,y));

    }
}
