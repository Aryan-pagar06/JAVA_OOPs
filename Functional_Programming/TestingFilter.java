
import java.util.List;
import java.util.function.Consumer;

public class TestingFilter
{
    public static void main(String[] args) {
        List <String> fruits = List.of("apple", "banana", "mango","cherry", "date");

        System.out.println(fruits.size());

         //traditional method
        System.out.println("\nPrinting fruits normally\n");
        for(String fruit : fruits) {       
           System.out.println(fruit);
        }

        //using streams
        System.out.println("\nPrinting fruits using stream\n");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
               System.out.println(fruit);
            }
        });

        //using streams but not overriding accept, but using lambda instead
        System.out.println("\nPrinting fruits using lambda, filter and stream\n");
        fruits.stream()
             .filter(fruit -> fruit.endsWith("e"))
             .forEach(fruit -> System.out.println(fruit)); //much simpler

    }
}