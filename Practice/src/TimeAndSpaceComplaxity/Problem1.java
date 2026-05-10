package TimeAndSpaceComplaxity;

public class Problem1 {


    static void main(String[] args) {
        int N = 100;
        int value = 0;
        for (int i = 1; i <= N; i+=i){
            value++;
            System.out.println(i);
        }
    }
}
