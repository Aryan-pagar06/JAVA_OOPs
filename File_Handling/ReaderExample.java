
import java.io.FileReader;
import java.io.IOException;


public class ReaderExample
{
   public static void main(String[] args) {
       String fileName = "example.txt";

       try (FileReader reader = new FileReader(fileName)) {
        int read;
        do {
        read = reader.read();
        System.out.print((char) read); //ascii 
        } while (read != -1);

       } catch (IOException e) {
        System.out.println(e.getMessage());
       }
   }
}