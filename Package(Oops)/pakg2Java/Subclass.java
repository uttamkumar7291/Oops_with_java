package pakg2Java;

import pakg1Java.Modifiers;
//------------------------------------code with Er. uttam kumar-------------------------------------------------------------------------//
// ----------------------------------Subclass in a different package-------------------------------------------------------------------//

public class Subclass extends Modifiers {

    public static void main(String[] args) {

        Subclass obj = new Subclass();

        System.out.println("Accessing members from a subclass in a different package:");
        System.out.println(obj.pub);
        System.out.println(obj.prot);
        // System.out.println(obj.deflt); //  default not accessible
        // System.out.println(obj.priv);  //  private not accessible
        obj.show();
    }
}
