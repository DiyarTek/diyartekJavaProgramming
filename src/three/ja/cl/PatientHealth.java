package three.ja.cl;

import java.util.Scanner;

// Decision-making , if , if else, nested if
public class PatientHealth {

    static void getDiabetesAssesment() {
        // Calling user input object
        //if else, nested if
                  /* Scanner scan = new Scanner(System.in);
        System.out.println("What is your age, my patient? ");
        int age = scan.nextInt();
        System.out.println("What is your weight, my patient? ");
        double weight = scan.nextDouble();

        if (age > 50) {
            if (weight > 100) {
                System.out.println("You have risk of diabetes");
            }
        } else {
            System.out.println("You have no risk of diabetes");
                  }  */

         Scanner scan = new Scanner(System.in);
        System.out.println("What is your age, my patient? ");
        int age = scan.nextInt();
        System.out.println("What is your weight, my patient? ");
        double weight = scan.nextDouble();
        System.out.println("How many days do you work out a week, my patient? ");
        int days=scan.nextInt();

        if(age>50){
            System.out.println("You have risk of diabetes");
        } else if(weight>=100){
            System.out.println("You have risk of diabetes");
        } else if(days<=3){
            System.out.println("You have risk of diabetes");
        }
        else {
            System.out.println("You have NO risk of diabetes");
        }
    }


    public static void main(String[] args) {

        PatientHealth.getDiabetesAssesment();


    }


}
