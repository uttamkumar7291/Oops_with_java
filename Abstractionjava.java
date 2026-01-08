
//--------------------------------------------------code with er. uttam kumar---------------------------------------------------
// Abstraction = > only show the realative information.
//1) “abstract keyword can be used with method and class”
//2) Abstract class methods must be implemented by subclasses.
/* 
abstract class Animal {
    abstract void sound();                          
}


class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstractionjava {
    public static void main(String[] args) {
        Animal a = new Dog();     //   upcasting  : animal reference but Dog object
        a.sound();
    }
}
//3) "If one method is abstract → whole class must be abstract"
*/
/* 
class Test {
    abstract void display(); // Error: class must be abstract
}
abstract class Test {
    abstract void display(); // ok
}*/
  
//4.) Abstract class cannot be instantiated (no object can be created)
//But —
//Abstract class can have constructors.
//When an object of the subclass is created, the constructor of the abstract class runs first.
/* 
abstract class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    abstract void show();
}
class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
    void show() {
        System.out.println("Child show method");
    }
}
public class Abstractionjava {
    public static void main(String[] args) {
        // Parent p = new Parent();   Not allowed
        Parent p = new Child();      // Allowed (through subclass)
        p.show();
    }
}
*/

//5) 5) “If the subclass inheriting the abstract class does not implement all its abstract methods, then the subclass must also be declared //abstract.”
//Abstract method means no body — it must be overridden by subclasses.

abstract class Parent {
    abstract void a();
}
abstract class Child extends Parent {
    // not implementing a() -> okay because Child is abstract
    void hello() {
        System.out.println("hello from Child");
    }
}
class GrandChild extends Child {
    @Override
    void a() {
        System.out.println("a implemented in GrandChild");
    }
}
public class Abstractionjava {
    public static void main(String[] args) {
        Parent p = new GrandChild();
        p.a();
       // p.hello();  Error: Parent reference can't access Child methods
        // Parent p2 = new Child(); // Not allowed: Child is abstract
    }
}

/* 
🔹 abstract = subclass must override
🔹 final, private, static = stop overriding
❌ So they can never be used together.*/





