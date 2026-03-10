public class ExceptionDemo1 {

    public static void main(String rainer []){
    
    int age = 15;
    if (age < 18){
        throw new ArithmeticException ("Not eligible to vote.");
    }
        System.out.println("Eligible to vote.");
  }
}
