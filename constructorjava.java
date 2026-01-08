
//-----------------------------------------------------code with er. uttam kumar--------------------------------------------
// CONSTRUCTOR IN OBJECT ORIENTED PROGRAMMING LANGUAGE
//constructor is a special method  which is invoked automatically at the time of object creation.
//it is use to initialize the data members of new objects generally.
//constructors don't have return type.

// there are three type of contructors = >

//1.Non-parameterized construcors(no argument)
//2.Parameterized construcors(has parameters)
//3.copy constructors
//--------------------------------------------------code with er. uttam kumar-----------------------------------------------------
class Student {

    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    // create  constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;

    }

    Student() {   // using copy constructor

    }

}

public class constructorjava {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "uttam";
        s1.age = 19;

        Student s2 = new Student(s1);  // s1 ki properties copy ki gayi hain
        s2.printinfo();

    }
}
