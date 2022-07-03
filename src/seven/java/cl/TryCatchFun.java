package seven.java.cl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFun {

    public static void main(String[] args) {
        try {

         Scanner scan = new Scanner(System.in);
         System.out.println("What's your phone number?");
         int phoneNum=scan.nextInt();
         System.out.println("My phone number is "+phoneNum);
         int result = phoneNum/0;
         System.out.println("Division "+result);

            System.out.println("Execution is done!");
        } catch (InputMismatchException e){
            System.out.println("Error: You didn't input a integer and probably your input limit is exceed the integer range");
        } catch (ArithmeticException e){
            System.out.println("Division format is incorrecct, please try agian "+e);
        }
        System.out.println("Execution is done!");

    }
}
