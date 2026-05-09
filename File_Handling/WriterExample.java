
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {

    public static void main(String[] args) {
        String fileName = "example.txt";
        try (FileWriter writer = new FileWriter(fileName)) { //try with resource
            writer.write("This is the example text in string\n");
            for (int i = 0; i < 10; i++) {
                writer.write('*');
            }
            for (int i = 0; i < 10; i++) {
                writer.write(" " + i);
            }
            writer.flush();
            System.out.println("Text written to file succesfully");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
