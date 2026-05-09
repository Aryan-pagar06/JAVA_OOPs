
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the file = ");
        String fileName = input.nextLine();
        try (FileReader reader = new FileReader(fileName)) {
            int r;
            do {
                r = reader.read();
                System.out.print((char) r);
            } while (r != -1);

        } catch(FileNotFoundException exception) {
            System.out.printf("%s not found" , fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
