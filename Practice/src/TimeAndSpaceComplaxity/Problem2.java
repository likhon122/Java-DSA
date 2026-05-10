package TimeAndSpaceComplaxity;

public class Problem2 {

    static void main(String[] args) {
        int value = 0 ;
        int N = 100;

        for (int i = 1; i<= N; i*=2){
            for (int j = 1; j <= i; j++){
                value++;
            }
        }
    }
}
