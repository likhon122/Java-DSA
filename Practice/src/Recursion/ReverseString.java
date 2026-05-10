package Recursion;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString2(String str){
        if(str.isEmpty()){
            return "";
        }
        return reverseString2(str.substring(1)) + str.charAt(0);
    }

    public static String reverseString(String str, int idx){
        if(str.length() <= idx) return "";
        return reverseString(str,idx+1) + str.charAt(idx);
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = input.nextLine();
        System.out.println(reverseString(str,0));
        System.out.println(reverseString2(str));
    }
}
