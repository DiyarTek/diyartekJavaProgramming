package seven.java.cl;

public class Recursion {

     static void countBackWard(int number){
         if (number==0){
             System.out.println("Backward counting is stop");
         } else {
             System.out.println(number);
             number--;
             countBackWard(number);
         }
     }


    public static void main(String[] args) {
     countBackWard(25);
    }


}
