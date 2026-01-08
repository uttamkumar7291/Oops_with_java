//-------------------------------------------------------code with Er. uttam kumar-------------------------------------------------------//
// Example of a logical error in Java

public class LogicalTime_Error {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical Error: subtraction used instead of addition
        int sum = a - b;  
        
        System.out.println("Wrong Result (Logical Error): " + sum);
    }
}
