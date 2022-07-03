package three.ja.cl;

public class LoopsLearn {
       static void getWhileLoop(){
           int i = 1;

           while (i <= 6) {

               System.out.println("Print this text");

               i++;//i=i+1
               System.out.println(i);

           }
       }
       static void getDoWhileLoop() {
           int i = 1;
           do {
               System.out.println("Print this text");

               i++;//i=i+1
           } while (i <= 0);
       }
       static void getForLoop(){

           for(int i=1;i<10;i++){

               System.out.println("Print this message until condition is not met");
           }

       }
       static void getOneToTenNumbers(){
           for (int i=1;i<=10;i++){
               System.out.println(i);
           }
       }
    public static void main(String[] args) {
        getOneToTenNumbers();
    }


}
