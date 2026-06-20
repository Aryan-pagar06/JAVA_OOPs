import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortInDesc
{
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("Zesty");
        names.add("Rahul");
        names.add("Vedant");
        names.add("Bhavya");
        System.out.println(names);
        Sort(names);
        System.out.println(names);

    }

    public static void Sort (List<String> str) {
       Collections.sort(str);
       Collections.reverse(str);
    } 
}