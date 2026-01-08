import java.io.File;
import java.io.IOException;

class Createfile {
   public static void main(String[] args) {
     File f = new File("c:\\Users\\uttam\\OneDrive\\Desktop\\createfile.txt");
    try {
            if (f.createNewFile()) {
         System.out.println("file created scessfully");
          }
         else {
           System.out.println("file already exist...!");
         }     
    }  catch (IOException i) {
          System.out.println("Exception handled");
    }
   } 
}