import java.util.Scanner;

class Calculator {

    void calculate(double a, double b, char op) {
        double result = 0;

        switch(op) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':     
                result = a * b;              
                break;

            case '/':            
                    result = a / b;
                    break;                        

            default:
                System.out.println("Invalid choice!");
        }
        System.out.println("Result: " +  result);

    }
   
}

public class Arithmatic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Choose operation (+ , - , * , /): ");
        char op = sc.next().charAt(0);

        Calculator c1 = new Calculator();
        c1.calculate(a, b, op);
    }
}




