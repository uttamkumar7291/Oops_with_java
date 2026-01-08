//-------------------------------------------------------code with Er. uttam kumar-------------------------------------------------------//
// Example of multiple catch blocks in Java

public class MultipleCatch {
  public static void main(String[] args) {
            try {
            int[] arr = new int[5];         
            arr[4] = 20;
            arr[6] = 10; 
            int result = 10 / 0; 
            int res  = 20 / 0;
            
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception ");
        } 
        catch (Exception e) {
            System.out.println("other Exception ");
        } 
        finally {
            System.out.println("Finally block executed");
        }


  }
}