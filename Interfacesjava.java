
//------------------------------------------------------code with uttam kumar----------------------------------------------------
//1. interface has no constructors .
//2. interface using implements keyword.
//3. interface behave like a abtraction.
//4. It is used to achieve abstraction and multiple inheritance in Java.
/* 
interface Animal {
  int eyes = 2;
  void walk();
}
interface Herbivore {
  int legs = 4;
}
class Hourse implements Animal,Herbivore {
  public void walk() {
    System.out.println("walk on 4 legs");

  }
}
public class Interfacesjava {
  public static void main(String[] args) {
    Hourse hose = new Hourse();
    hose.walk();
  }
}

*/
//-----------------------------------------------code with er. uttam kumar---------------------------------

class Student {
  String name;
  static String school;                       //static use for common properties
  static void changeSchool() {
    school = "newschool";
  }
}
public class Interfacesjava {
  public static void main(String[] args) {
    Student.school  = "Internation school Bhojpur(ara).";
    Student student1 = new Student();
    student1.changeSchool();
    student1.name =  "uttam kumar";
    System.out.println(student1.school);
  }
}