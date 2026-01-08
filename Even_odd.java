//------------------------------------------------code with er. uttam kumar-----------------------------------------------
//LAB
import java.util.Scanner;
class NumberCheck { // classes are blueprints for creating objects

    void fun(int a) {
        if (a % 2 == 0) {
            System.out.println("The given number is even = " + a);
        } else {
            System.out.println("The given number is odd = " + a);
        }
    }
}

public class Even_odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        NumberCheck obj = new NumberCheck(); // object creating           through constructor
        obj.fun(a);
    }
}
