package onetwo.ja.cl.operators;

public class AssignmentOperators {
       public static void calculateAdditionCompound() {
        // Declaring ja.cl.one.and.two.variables
        int a = 20, b = 10;

        System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);

        // Dividing & Assigning values
        a /= b;

        // Displaying the assigned values
        System.out.println("num1 = " + a);
    }
    public static void calculateSubtractionCompound(){
           int a=20, b=30;

           System.out.println("a ="+a);
           System.out.println("b ="+b);
           a-=b;// a= a-b;

        System.out.println("The result of a: "+a);

    }
}
