package ja.interview.questions;

public class SwapNumbers {
    // With third variable
    static void swapTwoNumWithThirdVar() {
        int x = 5;
        int y = 9;
        int temp = 6;

        temp = x;//5
        x = y;//9
        y = temp;

        System.out.println("Value of x is " + x + " value of y is " + y);

    }

    // Without third variable
    static void swapTwoNumWithoutThirdVar() {
        int a = 10;
        int b = 20;

        b = b + a; // now b is sum of both the numbers
        a = b - a; //
        b = b - a; //
        System.out.println("Value of a is " + a + " value of b is " + b);
    }

    public static void main(String[] args) {
        swapTwoNumWithThirdVar();
        //swapTwoNumWithoutThirdVar();
    }
}
