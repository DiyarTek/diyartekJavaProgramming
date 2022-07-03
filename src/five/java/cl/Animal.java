package five.java.cl;

import java.util.Scanner;

public class Animal {
       static int currentYear;
       static int birthYear;
       static int age;
       Animal(int currentYear, int birthYear, int age){
           this.currentYear=currentYear;
           this.birthYear=birthYear;
           this.age=age;
       }
      static void eats(){
          System.out.println("Animal is eating food");
      }
      static void walks(){
          System.out.println("Animal is walking");
      }
      static void calculateAnimalAge(){
          Scanner userInput= new Scanner(System.in);
          System.out.println("What is the current year?");
          currentYear=userInput.nextInt();
          System.out.println("What's your pet birth year?");
          birthYear=userInput.nextInt();
          age=currentYear-birthYear;
          System.out.println("Your pet is "+age+" years old");
      }


}
