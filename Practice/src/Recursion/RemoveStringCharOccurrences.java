package Recursion;

import java.util.Scanner;

public class RemoveStringCharOccurrences {

    public static String removeStringCharOccurrence(String str, char character, int idx){
        if(str.length() <= idx) return "";
        String newStr = "";
        if(str.charAt(idx) != character) newStr += str.charAt(idx);
        return newStr + removeStringCharOccurrence(str, character, idx+1);
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String str = input.next();
        System.out.print("Enter your removing character: ");
        char character = input.next().charAt(0);
        System.out.println(removeStringCharOccurrence(str,character,0));
    }
}
