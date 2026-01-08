import java.util.Scanner;
// using oops concept calculating tax for giveven salary.
 
// -------------------------------------------code with er. uttam kumar---------------------------------------------------------------------

class Taxjava {
  int tax  = 0;
  
  void calculatingtax(int salary) {

    if (salary <= 300000) {
    }
    else if(salary > 300000 && salary <= 500000 ) {
      tax = (salary-300000) * 10/100;      
    }
    else if (salary > 500000 && salary <= 1000000) {
      tax =((salary-500000) * 15/100 ) + 20000 ;
    }
    else if (salary > 1000000 && salary <= 1200000) {
      tax =((salary-1000000) * 20/100 ) + 20000 + 75000 ;
    }
    else if (salary > 1200000) {
      tax =((salary-1200000) * 30/100 ) + 20000 + 75000 + 40000 ;      
    }  
    System.out.println("Before reduction the total tax is  : " + tax);

  }
}
public class Tax {
 public static void main (String[] args) {
    System.out.println("Tax Slabs:");
    System.out.println("1:upto 3L -> 0% \n2:3L-5L -> 10%\n3:5L-10L -> 15%\n4:10L-12L -> 20%\n5:upto 12L -> 30%\n6:Above tax 50K -> Reduction 50K\n");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the salary here : ");
    int salary = sc.nextInt();

    Taxjava obj = new Taxjava();
    obj.calculatingtax(salary);

    int tax = obj.tax;
    if (tax > 50000) {
      int reduction =  tax - 50000;
      System.out.println("\nAfter Reduction, the total tax for salary " + salary + " is: " + reduction);
    }
    else {
      System.out.println("0% tax for this salary");
    }

  }
}