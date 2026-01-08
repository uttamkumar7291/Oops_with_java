//----------------------------------------------------code with er. uttam kumar-------------------------------------
// POLYMORPHISM IN OBJECT ORIENTED PROGRAMMING LANGUAGE
// meaning many form 

// there are two type of polymorphism 
//1. compile time polymorphism (static)
//2. Run time polymorphism (Dynemic )
/*class Student {

    String name;
    int age;

    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int age) {
        System.out.println(age);             //   This is called compile time polymorphism..overloading

    }

    public void printinfo(String name, int age) {
        System.out.println(name + " " + age);

    }
}

public class Polymorphismjava {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Uttam kumar";
        s1.age = 19;
        s1.printinfo(s1.name, s1.age);

    }
}
*/
//-----------------------------------------------   Run time polymorphism (Dynamic)  --------------------------------
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

public class Polymorphismjava {
    public static void main(String[] args) {
        Animal a = new Dog(); // Parent reference, Child object
        a.sound();            // Calls Dog's overridden method
    }
}


