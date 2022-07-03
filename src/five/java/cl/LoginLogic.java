package five.java.cl;

import java.util.Scanner;

public class LoginLogic {
    private String username;
    private String password;
  //Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {

        return password;
    }
  // Setter method
    public void setUsername(String username){
        this.username=username;

    }
    public void setPassword(String password){
        this.password=password;
    }

    public void loginVerification(){
         if (getUsername().equals("DiyarTek") && getPassword().equals("2022")){
              System.out.println("You're connected! ");
         } else if (getUsername().equals("Sophia") && getPassword().equals("2021")) {
             System.out.println("You're connected! ");

         } else {
             System.out.println("Wrong username/password, please ty again");
         }
    }

}
