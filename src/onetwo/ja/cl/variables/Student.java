package onetwo.ja.cl.variables;

public class Student {
    // static variable
    public static double weight;
    // instance variable
    public String name = "DiyarTek";

    public static void getMyAge() {
        // local variable
        int age = 30;
        System.out.println("Tell me my age: " + age);
    }

    public static void getMyName() {
        // Use instance variable here
        Student st = new Student();
        System.out.println("What's your name? " + "My name is " + st.name);
    }

    public static void getMyWeight(){
        weight=50.65;

        System.out.println("What's your weight? " + "My weight is "+weight);

    }


}
