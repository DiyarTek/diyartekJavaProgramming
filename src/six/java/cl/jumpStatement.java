package six.java.cl;


import java.util.Scanner;

public class jumpStatement {

    static void contiueStatement() {
        for (int i = 5; i <= 20; i++) {
            if (i == 9 || i == 15) {
                continue;
            }
            System.out.println("Statement body is executed " + i);
        }
    }

    static void breakStatement() {
        for (int i = 5; i <= 20; i++) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
        }
    }

    static void switchStatement() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day code: ");
        int day = scan.nextInt();
//          if (day==1){
//              System.out.println("Monday");
//          } else if(day==2){
//              System.out.println("Tuesday");
//          }else if(day==3){
//              System.out.println("Wenesday");
//          }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("You entered a non-exited code");

        }


    }

    static void convertStringToInteger(){
              String str="56";
              int strConvert=Integer.parseInt(str);
              // You can not do arithmetic operation on String and Integer datatype without converting it to the Integer
              System.out.println(strConvert+25);
    }
    static  void convertIntegerToString(){
           int age=100;
           int annualIncome=545465545;

           String convertToStrAge=Integer.toString(age);
           System.out.println(annualIncome+convertToStrAge);
    }

    public static void main(String[] args) {
        //contiueStatement();
        //breakStatement();
        //switchStatement();
        //convertStringToInteger();
        //convertIntegerToString();
    }
}
