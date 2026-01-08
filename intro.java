//----------------------------------------------------code with er. uttam kumar----------------------------------------------------------------
//Oops = > Object-Oriented Programming is a methodology or `para digram to design a program using classes and objects.it simlifies the software development and maintance by proving some conceps defined below:  ( saare kaam object ke aas paas hoga)
class IntroClass {

    int a;

    void fun() {
        a = 10;
        System.out.println("This is the value of a = " + a);

    }
}

public class intro {

    public static void main(String[] args) {
        IntroClass obj = new IntroClass();                   
        obj.fun();
    }
}
