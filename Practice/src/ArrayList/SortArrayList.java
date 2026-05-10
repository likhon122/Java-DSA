package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(1);
        list1.add(40);
        list1.add(11);

        System.out.println("Original List: " + list1);
        Collections.sort(list1);
        System.out.println("Sorted in Ascending order: " + list1);

        list1.sort(Collections.reverseOrder());
        System.out.println("Sorted in Descending order: " + list1);


        ArrayList<String> stringArr = new ArrayList<>();
        stringArr.add("Likhon");
        stringArr.add("Islam");
        stringArr.add("is");
        stringArr.add("not");
        stringArr.add("a");
        stringArr.add("good");
        stringArr.add("boy");
        System.out.println("Original List: " + stringArr);
        Collections.sort(stringArr);
        System.out.println("Sorted on Ascending order: " + stringArr);

        stringArr.sort(Collections.reverseOrder());
        System.out.println("Sorted on descending order: " + stringArr);
    }
}
