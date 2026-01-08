//--------------------------------------------------code with Er. uttam kumar-----------------------------------------------------//
// getChars() method in Java

public class GetChars {
    public static void main(String[] args) {
        String s = "HelloWorld";
        char[] arr = new char[5];

        s.getChars(0, 5, arr, 0);

        System.out.println(arr);
    }
}
