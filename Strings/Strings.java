//-----------------------------------------------------code with Er. uttam kumar-----------------------------------------------//
//   new String(...) constructors(Keyword) in Java
public class Strings {
    public static void main(String[] args) {

        // [1] Empty String constructor
        String s1 = new String();
        System.out.println("1. Empty String: '" + s1 + "'");

        // [2] String from another String
        String s2 = new String("Hello, World!");
        System.out.println("2. From another String: " + s2);

        // [3] String from character array
        char[] ch = {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(ch);
        System.out.println("3. From char array: " + s3);

        // [4] String from part of character array (startIndex, length)
        String s4 = new String(ch, 1, 3); 
        System.out.println("4. From part of char array: " + s4);

        // [5] String from byte array (ASCII values)
        byte[] b = {65, 66, 67, 68}; 
        String s5 = new String(b);
        System.out.println("5. From byte array: " + s5);

        // [6] String from part of byte array (startIndex, length)
        byte[] b2 = {65, 66, 67, 68, 69};  
        String s6 = new String(b2, 1, 3);
        System.out.println("6. From part of byte array: " + s6);
    }
}
