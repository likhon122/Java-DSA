package Recursion;

public class CombinesOfNumber {

    public static void combines(String dig,String[] arr, String result){
        if(dig.isEmpty()){
            System.out.print(result + " ");
            return;
        }
        int currentNum = dig.charAt(0) - '0';
        String currentChoice = arr[currentNum];
        for (int i = 0; i < currentChoice.length(); i++){
            combines(dig.substring(1), arr, result + currentChoice.charAt(i));
        }
    }

    static void main(String[] args) {
        String[] arr = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combines("23", arr, "");
    }
}
