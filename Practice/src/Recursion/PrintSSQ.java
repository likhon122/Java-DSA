package Recursion;

public class PrintSSQ {


    public static void printSSQ(String s, String currentAns){
        if(s.isEmpty()){
            System.out.println(currentAns);
            return;
        }
        char firstChar = s.charAt(0);
        String remaining = s.substring(1);
        printSSQ(remaining, currentAns+firstChar);// Add First char
        printSSQ(remaining,currentAns);
    }

    static void main(String[] args) {
        printSSQ("abc","");
    }
}
