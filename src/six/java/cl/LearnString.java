package six.java.cl;

import java.util.Scanner;

public class LearnString {

    static void getLengthOfString() {
        int length;
        String address = "1256 Sunset LIfe Rd, Tampa, FL";
        length = address.length();
        System.out.println("The length of the String is " + length);
    }

    static void joinTwoString() {
        String name = "Kanxia Joined ";
        String school = "DiyarTek";

        String joinedString = name.concat(school);

        System.out.println(joinedString);
    }

    static void compareTwoStrings() {
        String expectedWebsiteTitle = "DiyarTek Career Consulting";
        String actualWebsiteTitle;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What's the actual website title that you see? ");
        actualWebsiteTitle = userInput.nextLine();

        // Compare

        Boolean result = expectedWebsiteTitle.equals(actualWebsiteTitle);

        System.out.println(result);


    }
    static void extractCertainText(){
         String annou="Today I'll go to USA";

         String extractedTex=annou.substring(0,5);
         String extractedTexWithStartingIndex=annou.substring(6);
        System.out.println("With starting index: "+extractedTexWithStartingIndex);
         System.out.println(extractedTex);

    }
    static void  findTheContainText(){
        String name="fjdsjflksjdlkfjkasdjfkjdslkfjkdsjfkshdkfjjkdshfkdshfjhdsklDiyarTekjfjkdshjkfhjkdshfjkjshkjdfhjskdhfjkdshjkfhdsjkhfjkshdkfjhksjdfhkjsdhfjdshfjkhskjd";

        String schoolName="DiyarTek";

        if (name.contains(schoolName)){
            System.out.println("The text was found!");
        }
        else {
            System.out.println("The text was not found!");
        }
    }


    public static void main(String[] args) {
        //getLengthOfString();
        //joinTwoString();
        //compareTwoStrings();
       // extractCertainText();
       //findTheContainText();

    }

}
