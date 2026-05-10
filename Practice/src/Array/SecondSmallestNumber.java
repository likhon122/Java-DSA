package Array;

public class SecondSmallestNumber {
    public static int findSmallestNum(int[] intArr){
        int result = intArr[0];
        for (int j : intArr) {
            if (j < result) {
                result = j;
            }
        }
        return result;

    }

    static void main(String[] args) {
        int[] intArr = InputArr.inputIntArr();
        int firstSmallestNum = findSmallestNum(intArr);

        for (int i = 0; i<intArr.length; i++){
            if(intArr[i] == firstSmallestNum){
                intArr[i] = Integer.MAX_VALUE;
            }
        }

        int result = findSmallestNum(intArr);
        System.out.printf("Second Smallest Number is: %d", result);



    }
}
