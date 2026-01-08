
//-----------------------------------------------------code with Er. uttam kumar-----------------------------------------------------//
//intern() method in Java
public class Heap_to_literals {
    public static void main(String[] args) {
      String s1 = new String("Hello");
      String s2 = s1.intern(); // refers to the pooled "Hello"
      String s3 = "Hello";

        System.out.println(s1 == s3); // false
        System.out.println(s2 == s3); // true         
    }
}

