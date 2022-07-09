package ja.interview.questions;

import java.util.Scanner;

public class CheckGivenNumberIsOddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
         int userInput= scan.nextInt();

        if (userInput % 2!=0){
            System.out.println(userInput+" is an odd number!");
        }
        else {
            System.out.println(userInput+" is an even number!");

        }





    }

}
