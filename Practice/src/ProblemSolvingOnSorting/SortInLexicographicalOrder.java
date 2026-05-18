package ProblemSolvingOnSorting;


// Given an array of names of the fruits; you are supposed to sort it in lexicographical order using the selection sort
// Input: ["papaya","lime","watermelon","apple","mango","kiwi"]
// Output: ["apple","kiwi","lime","mango","papaya","watermelon"]


public class SortInLexicographicalOrder {

    static void sortInLexicographicalOrder(String[] arr){
        int n = arr.length;
        for (int i =0; i< n; i++){
            int minStrIndex = i;
            for (int j = i+1; j< n; j++){
                if( arr[minStrIndex].compareTo(arr[j]) > 0 ){
                    minStrIndex = j;
                }
            }

            if(minStrIndex != i){
                String temp = arr[i];
                arr[i] = arr[minStrIndex];
                arr[minStrIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
//        String[] arr = {"papaya","lime","watermelon","apple","mango","kiwi"};
        String[] arr = {"mobile", "machine", "mark","max", "m","a","a"};
        sortInLexicographicalOrder(arr);
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
