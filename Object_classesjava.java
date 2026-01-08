//---------------------------------------------------------------Code with Er. Uttam kumar-----------------------------------------------------
// OBJECT AND CLASSES IN OBJECT ORINTETED PROGRAMING LANGUAGE 
//Classes are blue print to object
//Objects are real world intities.repersent a person,place or any other items .it can instace of the class


class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writting something");

    }

    public void printcolor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class Object_classesjava {
    public static void main(String[] args) {
        Pen pen1 = new Pen();                                 // using "new" keyword space is alloted.
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
        pen1.printcolor();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen2.printcolor();

        Student s1 = new Student();
        s1.name = "Uttam kumar";
        s1.age = 19;
        s1.printinfo();

    }
}
