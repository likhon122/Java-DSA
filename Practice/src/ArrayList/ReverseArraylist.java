package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArraylist {

    public static void reverseArrayList(ArrayList<Integer> list){
        int i = 0, j = list.size()-1;

        while (i < j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }


    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        reverseArrayList(list);
        System.out.println(list);

    }
}
