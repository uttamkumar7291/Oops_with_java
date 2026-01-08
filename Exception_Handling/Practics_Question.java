// Throw/Throws Keyword in Java Exception Handling
//-------------------------------------------------------code with Er. uttam kumar--------------------------------------------//
import java.util.Scanner;
/* 
// Example of throw keyword in Java

public class Practics_Question {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age < 18) {
                throw new ArithmeticException("Age must be 18 or above!");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
*/
/* 
// Example of throws keyword in Java
public class Practics_Question{
    //This method say ArithmeticException can occur
    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("no denominator can be zero");
        } else {
            System.out.println("result " + (a / b));
        }
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);  // Risky, exception might occur
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
*/
class UttamException extends Exception {
    UttamException(String s) {
        super(s);
    }
}

class MyMovie {
    int age;
    Scanner sc = new Scanner(System.in);
    
    void getAge() throws UttamException, ArithmeticException {
        System.out.println("Enter your age");
        age = sc.nextInt();
        
        if(age < 18) {
            throw new UttamException("You are not allowed");
        } else if (age < 25) {
            throw new ArithmeticException("Age is < 25");
        }
     }
}


class Practics_Question {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        MyMovie m1 = new MyMovie();
        try {
            m1.getAge();
        }
        catch(UttamException e) {
            System.out.println(e);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        
        try {
            c = a / b;
        }
        catch(Exception uttam) {
            System.out.println(uttam);
        }
        finally {
            System.out.println("I will always execute");
        }
    }
}