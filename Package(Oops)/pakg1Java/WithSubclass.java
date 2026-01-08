
//package pakg1Java;
//--------------------------------------------------code with Er. uttam kumar---------------------------------------------------//
// ----------------------------------------------------Same Package With Subclass-------------------------------------------//
public class WithSubclass extends  Modifiers {
  public static void main  (String[] args) {    

    WithSubclass obj  = new WithSubclass();

     System.out.println(obj.pub);        // OK: public -> accessible
     System.out.println(obj.prot);       // OK: protected -> accessible in same package
     System.out.println(obj.deflt);      // OK: default -> accessible in same package
    // System.out.println(obj.priv);     // ERROR: private -> not accessible
    obj.show();                         // using metods can access private literals
  }
}