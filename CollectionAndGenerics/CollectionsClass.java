
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionsClass
{
    public static void main(String[] args) {
        List <Integer> NumList = new ArrayList<>();
        NumList.add(5);
        NumList.add(2);
        NumList.add(-99);
        NumList.add(103);
        NumList.add(45);
        System.out.print("Collection list is : ");
        for (Integer i : NumList) {
            System.out.print(i + " ");
        }
        Collections.sort(NumList);
        System.out.println();
        System.out.print("Sorted collection list is : ");
        for (Integer i : NumList) {
            System.out.print(i + " ");
        }
        Collections.reverse(NumList);
        System.out.println();
        System.out.print("Reversed collection list is : ");
        for (Integer i : NumList) {
            System.out.print(i + " ");
        }
        Collections.shuffle(NumList);
        System.out.println();
        System.out.print("Shuffled collection list is : ");
        for (Integer i : NumList) {
            System.out.print(i + " ");
        }

        List <Integer> unmodifiable = Collections.unmodifiableList(NumList);
        unmodifiable.add(88); //throws exception

    }
}