package Recursion;

import java.util.Scanner;

public class LCD {
    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        }

        return gcd(y, x%y);
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of X: ");
        int x = input.nextInt();
        System.out.print("Enter value of Y: ");
        int y = input.nextInt();
        System.out.println("Lcd is: " + ((x*y)/gcd(x,y)));
    }
}
