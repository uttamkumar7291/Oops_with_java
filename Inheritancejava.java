//-------------------------------------------------coder with er. uttam kumar----------------------------------------------------------------
// INHERITANCE IN OBJECT ORIENTED PROGRAMMING LANGUAGE
//ek class ki properties jab dusri class ko milti hain to ise inheritance kehte hain
//inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically

//There are four types of ingeritance 

//1.single inheritance
//2.hierarchical inheritance
//3.multi-level inheritance
//4.hybrid inheritance  :-->  Hybrid inheritance is not directly supported with classes because of ambiguity (diamond problem).
//  But with interfaces, Java safely supports hybrid inheritance.
//5. multiple inheritance with interfaces

/*class Shape {

    public void area() {
        System.out.println("Display area ");

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

public class Inheritancejava {

    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();
        Circle c1 = new Circle();
        c1.area(1);
        Triangle t1 = new Triangle();
        t1.area(2, 2);

    }
}*/
//------------------------------------   inheritance + Overriding ----------------------------------------------------------------

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Inheritancejava {
    public static void main(String[] args) {
        Animal a1 = new Dog();   // Parent reference → Child object
        Animal a2 = new Cat();   // Parent reference → Child object

        a1.sound();  // Output → Dog barks
        a2.sound();  // Output → Cat meows
    }
}
 
