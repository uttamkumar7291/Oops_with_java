
//Used to call the parent class constructor or methods(variables, methods, constructors).
//Constructors are not inherited.
//But when creating a subclass object, parent constructor runs first, then the child’s.
//You can use super() to call the parent constructor.
//super(arguments) must be used.
//------>>use in variables

/* 

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println(color);        // child class variable
        System.out.println(super.color);  // parent class variable
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
*/

//------>>use in methods :
/* 
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }

    void display() {
        eat();          // child method
        super.eat();    // parent method
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
*/

//------>>use in constructors :
// The super() call is used inside the child constructor to call the parent class constructor.


class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // calls Animal constructor
        System.out.println("Dog constructor called");
    }
}

public class Super_Keyword {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}


