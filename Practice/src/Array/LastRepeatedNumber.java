package Array;

public class LastRepeatedNumber {
    public static int lastRepeatedNum(int[] intArr){

        int lastRepeatedNum = -1;
        for (int i = 0; i < intArr.length; i++){
            for (int j= i+1; j < intArr.length; j++){
                if(intArr[i]==intArr[j]){
                    lastRepeatedNum = intArr[i];
                }
            }
        }
        return lastRepeatedNum;
    }


    static void main(String[] args) {
        int[] intArr = InputArr.inputIntArr();

        int result = lastRepeatedNum(intArr);

        System.out.printf("Last repeated number is: %d", result);

    }
}
