package ja.interview.questions;

public class ReverseString {
    // Used StringBuilder
    static void reverseStrWithStrBuilder() {

        String userInput = "DiyarTek";
        StringBuilder reversedOutput = new StringBuilder(userInput);

        System.out.println(reversedOutput.reverse());
    }

    // Without StringBuilder
    static void reverseStringWithoutBuilder(String userInput) {
        try {
            // Convert String to char array by using toCharArray method
            char[] resultarray = userInput.toCharArray();

            for (int i = resultarray.length - 1; i >= 0; i--)

                // print reversed String

                System.out.print(resultarray[i]);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        //reverseStrWithStrBuilder();
        //reverseStringWithoutBuilder("DiyarTek");

    }
}
