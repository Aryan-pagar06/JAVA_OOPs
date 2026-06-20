import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChars
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Enter your string : ");
        str = input.nextLine();
        Set <Character> unique = new HashSet<>();
        for(int i=0; i<str.length(); i++) {
            unique.add(str.charAt(i));
        }
        System.out.printf("Number of unique characters in the string : %d",unique.size());

    }
}