//-------------------------------------code with  Er. uttam kumar--------------------------------------------------------------------------
/* 
1. Constructor Overloading → Possible (same name, different parameters).
2. Constructor Overriding → Not possible (constructors are not inherited).
3. When you create an object of a subclass:
4. Parent constructor runs first (via super()),
5. then Child constructor runs. 
6. When you create a child object:
7. Java first calls the Parent constructor (super()),
then executes the Child constructor,
so the whole object (Parent + Child) is properly built.
8. Constructors are not inherited.*/
class Student {
    String name;
    int age;

    // No parameters constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // 1 parameter constructor
    Student(String n) {
        name = n;
        age = 0;
    }

    // 2 parameter  constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructors_Overloading {
    public static void main(String[] args) {
        Student s1 = new Student(); // No parameters constructor
        Student s2 = new Student("Uttam"); // 1 parameter  constructor
        Student s3 = new Student("Ravi", 20); // 2 parameter  constructor

        s1.display(); // Name: Unknown, Age: 0
        s2.display(); // Name: Uttam, Age: 0
        s3.display(); // Name: Ravi, Age: 20
    }
}
