
import java.util.List;

public class TestingMethodRef {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(a -> a % 2 != 0)
                .forEach(a -> System.out.println(a)); //using lambda

        numbers.stream()
                 .filter(a -> a % 2 != 0)
                 .forEach(System.out :: println); //using method reference 
    }
}
