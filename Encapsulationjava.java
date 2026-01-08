
//import java.util.*;  //This is package for using through scanner user input
//---------------------------------------------------code with uttam kumar -------------------------------------------------
// Encapsulation = > Binding of data memeber and member fuction into a single unit is known as class and this concept Encapsulation.
//import bank; 
class Shape {

    public void area() {
        System.out.println("Display Area : ");

    }
}

class Triangle extends Shape {

    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {

    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Encapsulationjava {
     
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
        Circle c = new Circle();
        c.area(2);
    }
}
