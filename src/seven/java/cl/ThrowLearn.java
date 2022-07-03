package seven.java.cl;

import java.util.InputMismatchException;

public class ThrowLearn {
    static int division(int a, int b) throws ArithmeticException {
        if (a==0){

            throw new ArithmeticException("Number is prohibited in this division");
        } else {
            int result =a/b;

            System.out.println("Result "+result);
            return result;
        }
    }

    public static void main(String[] args) {
          division(0,6);
    }
}
