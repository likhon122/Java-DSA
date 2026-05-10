package Array;

public class SwapTwoInt {

    public static void swapTwoInt(int a, int b){
        System.out.println("Before Swaping");
        System.out.println("A: " + a);
        System.out.println("B: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swaping");
        System.out.println("A: " + a);
        System.out.println("B: "+b);
    }


    static void main(String[] args) {
        int a = 10;
        int b = 5;
        swapTwoInt(a,b);

    }
}
