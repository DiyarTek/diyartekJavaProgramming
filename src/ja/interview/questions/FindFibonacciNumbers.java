package ja.interview.questions;
/*
A Fibonacci Series in Java is a series of numbers in which the next number is the sum of the previous two numbers.
The first two numbers of the Fibonacci series are 0 and 1. The Fibonacci numbers are significantly used in the
computational run-time study of an algorithm to determine the greatest common divisor of two integers.
In arithmetic, the Wythoff array is an infinite matrix of numbers resulting from the Fibonacci sequence.

The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

 */
public class FindFibonacciNumbers {
    public static void main(String[] args) {
        int maxNum=10;
        int previousNum=0;
        int nextNum=1;

        for (int i=1;i<=maxNum;++i){

            System.out.println(previousNum+" ");

            int sum=previousNum+nextNum;
            previousNum=nextNum;
            nextNum=sum;
        }

    }
}
