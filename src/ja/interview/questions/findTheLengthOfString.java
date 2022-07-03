package ja.interview.questions;

public class findTheLengthOfString {

    // Find length of the String with inbuilt functionalities
    static void findLengthOfStringWithInbuilt() {
        String address = "1245 richard blvd, Tampa, Fl 22645";

        int length = address.length();

        System.out.println(length);
    }

    // Find length of the String without inbuilt function
    static void findLengthOfStringWithoutInbuilt() {
        String address = "1245 richard blvd, Tampa, Fl 22645";

        int length = 0;
        char[] chars = address.toCharArray();

        for (char c : chars) {
            length++;
        }
        System.out.println(length);

    }

    public static void main(String[] args) {
        findLengthOfStringWithInbuilt();
        findLengthOfStringWithoutInbuilt();
    }
}
