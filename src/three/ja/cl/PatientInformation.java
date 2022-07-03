package three.ja.cl;


// Parameterization, return type
public class PatientInformation {
    // no return type
    static void getPatientAgeAndName(String name, int age) {
        System.out.println("Hello doctor, my name is " + name + " and I'm " + age);
    }

    // returning value
    static double getRemainingAccountBalanceAfterWithdral(double withdralAmount, double totalAmount) {

        System.out.println("Your account balance is : ");

        return totalAmount - withdralAmount;
    }

    static double getRemainingAccountBalanceAfterDesposit(double depositAmount, double totalAmount) {

        System.out.println("Your account balance is : ");

        return totalAmount + depositAmount;
    }
  // Parameters, return type
    public static void main(String[] args) {

        //get patient name and age
        getPatientAgeAndName("Abu", 20);

        // get remaining balance

        //Withdral balance
        double remainingBalanceAfterWithdral;

        remainingBalanceAfterWithdral= getRemainingAccountBalanceAfterWithdral(200, 1000);
        System.out.println(remainingBalanceAfterWithdral);

        //Desposit balance
        double remainingBalanceAfterDeposit;

        remainingBalanceAfterDeposit = getRemainingAccountBalanceAfterDesposit(200, 10000);
        System.out.println(remainingBalanceAfterDeposit);
    }


}
