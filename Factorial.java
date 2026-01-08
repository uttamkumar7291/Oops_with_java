
import java.util.Scanner;
//lab factorial
//-------------------------------------code with uttam kumar-------------------------------------------

class factorial_calculator {

    int fact(int num) {
        if (num == 0) {
            System.out.println("Factorial of " + num + " is 1");
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }
        return 0;
    }
}

class Factorial {

    public static void main(String[] args) { //static means bina object banaye class ke is function run kar sake
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        factorial_calculator f1 = new factorial_calculator();
        f1.fact(num);
    }
}
