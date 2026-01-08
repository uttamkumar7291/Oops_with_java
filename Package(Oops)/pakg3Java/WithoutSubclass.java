package pakg3Java;

import pakg1Java.Modifiers;
//---------------------------------------------code with Er. uttam kumar-------------------------------------------------//
//--------------------------------------------------Different Package Without Subclass----------------------------------------------//

public class WithoutSubclass {

    public static void main(String[] args) {
        Modifiers mod = new Modifiers();
        System.out.println(mod.pub);
        // System.out.println(mod.prot);
        // System.out.println(mod.def);
        // System.out.println(mod.priv);
        mod.show();

    }
}
