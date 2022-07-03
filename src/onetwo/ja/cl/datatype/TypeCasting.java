package onetwo.ja.cl.datatype;

public class TypeCasting {


    public static void convertImplicit(){
        // Implicit casting
        double b=5;
        double a=6;

        System.out.println(b);

    }
    public static void convertExplicitly(){
        int a=(int)3.954545454;
        System.out.println(a);

        // Convert Long into int, long is 60

    }

    public static void main(String[] args) {
          convertExplicitly();
        convertImplicit();
    }

}
