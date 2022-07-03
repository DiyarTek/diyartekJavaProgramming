package seven.java.cl;

public class ConverStringToInteger {

    //String to integer
    static void convertStringToInteger(){
        //interview Questions
        String phoneNum="54545545";

        int convertedString=Integer.parseInt(phoneNum);

        int result=convertedString+55;
        System.out.println(result);
    }
    // Integer to String
    static void convertIntegerToString(){
        int zipcode=75023;

        String intConversion=Integer.toString(zipcode);

        System.out.println(intConversion+25);
    }

    public static void main(String[] args) {
      convertIntegerToString();
    }
}
