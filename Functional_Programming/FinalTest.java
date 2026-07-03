import java.util.List;
import java.util.Optional;

public class FinalTest
{
   public static void main(String[] args) {
       List<String> numbers = List.of("1", "2", "3", "4", "5");

       Optional<Integer> totalSum = numbers.stream()
                .map(Integer :: parseInt)
                .map( i -> i * i)
                .reduce(Integer::sum);

    System.out.println(totalSum);
   }
}