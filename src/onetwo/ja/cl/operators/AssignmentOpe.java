package onetwo.ja.cl.operators;

public class AssignmentOpe {
    static int a;
    static int b;

    public static void calculateSub() {
        a = 6;
        b = 7;

        double result = a -= b;

        System.out.println("The result of substraction is: " + result);
    }

    public static void calculateAdd() {
        a = 9;
        b = 10;

        double result = a += b;

        System.out.println("The result of addtion is: " + result);
    }

    public static void calculateDivide() {
        double c = 4;
        c /= 9.0;


        System.out.println("The result of division is: " + c);
    }

}
