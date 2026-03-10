public class ExceptionDemo1 {

    public static void main(String rainer []){
        
    try{
        int arr[] = new int[3];
        arr[5] = 10/0;
    }
    catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index error.");
    }
    catch(Exception e){
        System.out.println("General Exception.");
    }
  }
}
