
import java.util.List;

public class FilterAndReduce {

    public static void main(String[] args) {
        List<String> string = List.of("Aryan Pagar", "MIT-WPU student in Pune", "Kothrud",
                "Is learning", "JAVA");
        String result = string.stream()
                .filter(s -> s.length() >= 10)
                .reduce("", (a, b) -> a + b);
        System.out.println(result);
    }
}
