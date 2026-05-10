package TimeAndSpaceComplaxity;

public class Problem4 {

    static void main(String[] args) {
        int value = 0;
        int N = 100;
        for (int i = N; i > 0; i /=2){
            for (int j = 0; j < i; j++){
                value++;
            }
        }
    }
}
