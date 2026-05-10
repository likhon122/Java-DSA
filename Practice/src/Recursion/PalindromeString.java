package Recursion;

import java.util.Scanner;

public class PalindromeString {

    static String reverse(String str){
        if(str.isEmpty()) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static Boolean isPalindrome(String str){
        return reverse(str).equals(str);
    }

    public static Boolean isPalindrome2(String str){

        if(str.isEmpty()) return false;
        if(str.charAt(0) == str.charAt(str.length()-1)) return true;
        return isPalindrome(str.substring(1,str.length()-1));
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = input.nextLine();
        if(isPalindrome2(str)){
            System.out.println("Your String is palindrome");
        }else {
            System.out.println("Your String is not palindrome");
        }
    }
}
