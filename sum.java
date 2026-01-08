//---------------------------------------------------------------Code with Er. Uttam kumar------------------------------------------------
import java.util.Scanner;



class Example {

    int a;
    int b;

    void performsum(int a, int b) {
        int sum = a + b;
        System.out.println("this is the sum = " + sum);

    }
}

public class sum {

    public static void main(String[] args) {
        Example obj = new Example();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the first element : ");
       int a = sc.nextInt();
       System.out.println("Enter th second element : "); 
       int b = sc.nextInt();
        obj.performsum(a, b);

    }
}
