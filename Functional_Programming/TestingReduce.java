import java.util.List;
import java.util.function.BinaryOperator;
public class TestingReduce
{
    public static void main(String[] args) {
        List <Integer> numbers = List.of(1, 3, 4, 2, 5, 6, 3);

        //without reduce
        int sum= 0;
        for(Integer i : numbers) {
            sum = sum + i;
        }
        System.out.println(sum);

        //with reduce 
       int newSum = numbers.stream()
                 .reduce(0, new BinaryOperator<Integer>()
                 {
                     @Override
                     public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                     }
                 });
        System.out.println(newSum);

        //with reduce and lambda 
       int newSum2 = numbers.stream()
                 .reduce(0, (a, b) -> a + b);
        System.out.println(newSum2);


       //using lambda to find max value
       int max = numbers.stream()
                 .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Max value = " + max);

    }
}