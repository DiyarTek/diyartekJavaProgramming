package ja.interview.questions;

public class RemoveWhiteSpace {
    public static void main(String[] args) {

        String Str = new String("Hello welcome to DiyarTek, our website is : www.diyartek.com");
        System.out.print("Return Value :");
        System.out.println(Str.replaceAll(" ", ""));

    }
}
