import java.util.Scanner;
//-------------------------------------------------------code with Er. uttam kumar----------------------------------------//
// Example of exception handling in Java 


public class Error_Handing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator:");
        int numerator = sc.nextInt();

        System.out.println("Enter denominator:");
        int denominator = sc.nextInt();

        try {
            
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
           
            System.out.println("Do not enter Zero as Denominator => ");
        }
        finally {
            int c = numerator + denominator;
            System.out.println("Sum is : " + c);
        }

       
    }
}
