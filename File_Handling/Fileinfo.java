//------------------------------------------------Code with Er. Uttam Kumar-------------------------------------------------------------//
import java.io.File;
class Fileinfo {
   public static void main(String[] args) {
      File f = new File("c:\\Users\\uttam\\OneDrive\\Desktop\\createfile.txt");
      if (f.exists()) {
          System.out.println("File name: " + f.getName());
          System.out.println("Absolute path: " + f.getAbsolutePath());
          System.out.println("Writeable: " + f.canWrite());
          System.out.println("Readable: " + f.canRead());
          System.out.println("File size in bytes: " + f.length());
      } else {
          System.out.println("The file does not exist.");
      }
   }
}