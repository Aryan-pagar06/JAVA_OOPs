import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct
{
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 1, 2, 4, 5, 6, 6, 7, 6, 6, 9);
        List <Integer> distinctNumbers = numbers.stream()
                 .distinct()
                 .collect(Collectors.toList());
        System.out.print(numbers + " ");
        System.out.println();
        System.out.print(distinctNumbers + " ");
    }
}