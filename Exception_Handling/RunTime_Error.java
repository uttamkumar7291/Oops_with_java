//-------------------------------------------------------code with Er. uttam kumar-------------------------------------------------------//
// Example of a runtime error in Java


public class RunTime_Error {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int result = a / b; // runtime error (not possible to divide by zero)
        System.out.println(result);
    }
}
