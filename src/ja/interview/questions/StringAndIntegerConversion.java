package ja.interview.questions;

public class StringAndIntegerConversion {
    // String to integer
    static int convertToInteger(String input) {

        int convertedInteger = Integer.parseInt(input);
        System.out.println(convertedInteger + 22);
        return convertedInteger;

    }
    // integer to String
    static String convertToString(int input) {

        String convertedInteger = Integer.toString(input);
        System.out.println(convertedInteger + 22);
        return convertedInteger;

    }
    public static void main(String[] args) {
        //convertToInteger("0");
        //convertToString(0);
    }
}
