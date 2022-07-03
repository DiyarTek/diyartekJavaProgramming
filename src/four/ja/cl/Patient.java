package four.ja.cl;

public class Patient {
       String name;
       int patientID;

       Patient(String name, int patientID){
           this.name=name;
           this.patientID=patientID;
       }

    public static void main(String[] args) {
        // Declare
        Patient[] arry;
        arry= new Patient[3];//0,1,2,3

        arry[0]= new Patient("John", 664745);
        arry[1]=new Patient("Jack", 76453);
        arry[2]=new Patient("Abu", 2645355);

       for (int i=0;i<arry.length;i++){

           System.out.println("The patient name is "+arry[i].name+" and patient ID is "+arry[i].patientID);
       }




    }
}
