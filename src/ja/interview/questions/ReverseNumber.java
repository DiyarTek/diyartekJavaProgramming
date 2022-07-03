package ja.interview.questions;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 56789;
        int rev = 0;

        while (num != 0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        System.out.println("Reversed number is " + rev);
    }


}
