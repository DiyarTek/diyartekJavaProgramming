package five.java.cl;

public class MethodOverloading {
      static void getMyInformation(String name, int phoneNum){
      }
     static void getMyInformation(String name, int phoneNum, String  address){
     }

    public static void main(String[] args) {
         getMyInformation("DiyarTek", 54545454, "1586 ave blv, FL");

    }
}
