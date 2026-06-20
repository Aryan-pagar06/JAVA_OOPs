
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swap {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aryan");
        names.add("Pankaj");
        names.add("Pagar");
        System.out.println(names);
        Collections.swap(names, 0, 2);
        System.out.println(names);
        swap(names, 0, 1);
        System.out.println(names);
    }

    public static void swap(List<String> names, int i, int j) {
        String temp = names.get(i);
        names.set(i, names.get(j));
        names.set(j, temp);
    }
}
