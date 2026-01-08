/* this() can call another constructor of the same class. This is called constructor chaining.*/
/*-->>this is a reference variable in Java that refers to the current object of a class.
-->>It is commonly used to differentiate between instance variables and local variables, invoke current class methods, or call another constructor in the same class*/

class Student {
    String name;
    int age;

    Student() { 
        System.out.println("Default constructor");
    }

    Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;      
        System.out.println("Name: " + this.name + ", Age: " + this.age);
        System.out.println("Parameterized constructor");
    }
}

public class This_keyword {
    public static void main(String[] args) { 
        Student s = new Student("uttam kumar", 19); 
    }
}

