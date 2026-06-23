
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap
{
    public static void main(String[] args) {
        Map <String, String> nation = new HashMap<>(); //<Country, Capital>
        nation.put("India", "Delhi");
        nation.put("Canada", "Ottawa");
        nation.put("France", "Paris");
        nation.put("Italy", "Rome");
        nation.put("Nepal", "Kathmandu");

        String inputCountry;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your country : ");
        inputCountry = input.nextLine();

        if(nation.containsKey(inputCountry)) {
            System.out.println("Information : " + inputCountry + " -> " + nation.get(inputCountry));
        }
        else {
            System.out.println("Your nation does not exist in data");
        }


    }
}