
//package pakg1Java;
//---------------------------------------------code with Er. uttam kumar-------------------------------------------------//
// ----------------------------------------------------Same Package Without Subclass----------------------------------------------//
public class Same_Package {
  public static void main  (String[] args) {    

    Modifiers mod  = new Modifiers();

     System.out.println(mod.pub);        // OK: public -> accessible
     System.out.println(mod.prot);       // OK: protected -> accessible in same package
     System.out.println(mod.deflt);      // OK: default -> accessible in same package
    // System.out.println(mod.priv);     // ERROR: private -> not accessible
     mod.show();                         // using metods can access private literals
  }
}