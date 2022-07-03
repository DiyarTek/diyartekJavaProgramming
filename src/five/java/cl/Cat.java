package five.java.cl;

public class Cat extends Animal{
    Cat(int currentYear, int birthYear, int age) {
        super(currentYear, birthYear, age);
    }
    static void talk(){
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        eats();
        walks();
        calculateAnimalAge();
        talk();
    }
}
