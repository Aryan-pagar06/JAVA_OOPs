import java.util.Scanner;
public class DiceRoll
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'R' to roll the dice = ");
        String str = input.next();
        if(str.equalsIgnoreCase("R"))
        {
            int outcome = (int)(Math.random() * 6) + 1;
            System.out.print("Rolled outcome is = " + outcome);
        }
        else {
            System.out.println("Please enter 'R'.");
        }

    }
}