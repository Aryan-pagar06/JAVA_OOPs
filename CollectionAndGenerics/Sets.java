
import java.util.HashSet;
import java.util.Set;

public class Sets
{
    public static void main(String[] args) {
        Set <String> fruits = new HashSet<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); //set cannot contain duplicate elements
        System.out.println(fruits.size());
        if(fruits.contains("Banana")) {
            System.out.println("Contains");
        }
        for (String s : fruits) {
            System.out.println(s);
        }
    }
}