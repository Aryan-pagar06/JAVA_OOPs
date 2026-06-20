
import java.util.HashMap;
import java.util.Map;

public class Maps
{
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 500);
        map.put("Kiwi", 130);
        map.put("Grapes", 50);
        map.put("Watermelon", 70);
        System.out.println(map.size());
        System.out.println(map.get("Kiwi"));
        System.out.println(map.get("papapya")); //null
        System.out.println(map.containsKey("Watermelon"));
        System.out.println(map.containsKey("Mango"));
        System.out.println(map.remove("Grapes"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %d\n", key, map.get(key));
        }

    }
}