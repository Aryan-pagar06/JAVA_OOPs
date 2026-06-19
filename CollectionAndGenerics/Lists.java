import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // List strList = new ArrayList(); //has some problems
        List <String> strList = new ArrayList<>(); //so we declare it this way
        strList.add("Aryan");
        System.out.println(strList.get(0));
        // strList.add(54); //adds int too, but we want string only so new method of declaration
        
    } 
}