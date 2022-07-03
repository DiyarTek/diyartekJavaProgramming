package five.java.cl;

public class LoginPortal {
    //User interface
    public static void main(String[] args) {
          LoginLogic ll= new LoginLogic();
          ll.setUsername("DiyarTek");// username field
          ll.setPassword("2022");// password field
          ll.loginVerification();// login button
    }
}
