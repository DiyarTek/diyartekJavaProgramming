package three.ja.cl;

// Constructor and this keyword

public class StudentInformation {
      String studentName;
      int studentAge;


    // Parameterized constructor, this keyword
     StudentInformation(String studentName, int studentAge){
            this.studentName=studentName;
            this.studentAge=studentAge;
     }

        /* Default constructor
    StudentInformation(){   }*/

    public static void main(String[] args) {
      StudentInformation studentInfoObject= new StudentInformation("Kanxia", 20);
       System.out.println(studentInfoObject.studentName);
        System.out.println(studentInfoObject.studentAge);
    }
}
