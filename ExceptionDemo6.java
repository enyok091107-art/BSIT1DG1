import java.util.*;
import java.util.InputMismatchException;

public class ExceptionDemo6 {

    public static void main (String rainer []){
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            if (name.isEmpty()) throw new IllegalArgumentException("Name is Empty");

            System.out.print("Enter grade 1: ");
            double g1 = sc.nextDouble();
            if (g1 < 0) throw new IllegalArgumentException("Negative grade is not alllowed");
                while(g1 > 101) throw new IllegalArgumentException("Grade above 100 is not alllowed");

            System.out.print("Enter grade 2: ");
            double g2 = sc.nextDouble();
            if (g2 < 0) throw new IllegalArgumentException("Negative grade is not alllowed");

            System.out.print("Enter grade 3: ");
            double g3 = sc.nextDouble();
            if (g3 < 0) throw new IllegalArgumentException("Negative grade is not alllowed");

            double average = (g1 + g2 + g3) / 3.0;

            System.out.println("\nStudent name: " + name);
            System.out.printf("Final Average: %.2f\n" , average);
        }
        
        catch(InputMismatchException e){
            System.out.println("\nInvalid grade input.");
        }
        catch(IllegalArgumentException e){
            System.out.println("\nError: " + e.getMessage());
        }
        finally{
            sc.close();
        }

    }
}
