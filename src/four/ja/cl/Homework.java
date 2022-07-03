package four.ja.cl;

import java.util.Scanner;

public class Homework {

    static void calculateSum() {

        //sum 1-10
        int sum = 0;//1,3,6

        for (int i = 1; i <= 10; i++) {// i=i+1
            sum += i;//sum+i
        }
        System.out.println(sum);//1,3,6
    }

    static void calculateMul() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }

    static void reveredNum() {
        int num;
        int reverse = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scan.nextInt();//user input

        // run loop until it's 0
        while (num != 0) { //123
            int numeric = num % 10;//1
            reverse = reverse * 10 + numeric; //321

            // remove the last digit from num
            num /= 10;// 0
        }
        System.out.println("Reverse number is " + reverse);


    }

    public static void main(String[] args) {
//        calculateSum();
         //calculateMul();
        reveredNum();
    }
}
