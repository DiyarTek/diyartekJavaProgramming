package ja.interview.questions;

public class FindStringContainsInTheText {

     static boolean isContain(String input){
         String address="1582 diyartek rd, Fairfax, VA";

         return address.contains(input);
     }
    public static void main(String[] args) {
         System.out.println("Test your input");

         System.out.println(isContain("diyar54te"));

    }
}
