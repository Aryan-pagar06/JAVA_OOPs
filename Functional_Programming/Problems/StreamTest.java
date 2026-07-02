
import java.util.List;

public class StreamTest
{
    public static void main(String[] args) {
        List <String> names = List.of("Aryan", "Rahul", "Rohan", "Pooja");
        names.stream()
                 .forEach(s -> System.out.println(s));
    }
}