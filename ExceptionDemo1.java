public class ExceptionDemo1 {

    public static void main(String rainer []){
        int a = 10;
        int b = 0;        

        try{
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e) {
            System.out.println("cannot divide by zero.");
        }
        System.out.println("Program continue.");
    }
}
