package Recursion;

public class Power {

//    public static int power(int p, int q){
//        if(q == 0){
//            return 1;
//        }
//        if (q < 2){
//            return p;
//        }
//
//
//        int pow = power(p, q-1);
//        return pow * p;
//    }

    public static int power(int p, int q){
        if(q == 0){
            return 1;
        }

        int smallPaw = power(p, q/2);
        if(q % 2 == 0){
            return smallPaw * smallPaw;
        }

        return p * smallPaw  * smallPaw;
    }

    static void main(String[] args) {
        System.out.println(power(4,2));
    }
}
