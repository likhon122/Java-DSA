package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GetSSQ {

    public static ArrayList<String> getSSQ(String s){
        ArrayList<String> list = new ArrayList<>();
        // Base Case
        if(s.isEmpty()){
            list.add("");
            return list;
        }

        char firstChar = s.charAt(0);
        // Recursive work
        ArrayList<String> subAns = getSSQ(s.substring(1));

        // Self work add first letter
        for (String ss: subAns){
            list.add(ss);
            list.add(firstChar+ss);
        }
        return list;
    }

    static void main(String[] args) {
        System.out.println(getSSQ("abc"));
    }
}
