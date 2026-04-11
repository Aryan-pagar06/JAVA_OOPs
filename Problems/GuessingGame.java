import java.util.Scanner;
public class GuessingGame
{
    int random;
    GuessingGame () {
      random = (int)(Math.random() * 100) + 1;
    }
    int CheckGuess(int guess) {
        return guess - random ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guessing game from 1 to 100");
        int guess;
        int result;
        GuessingGame guess1 = new GuessingGame(); // for random 
        do {
        System.out.print("Enter your guess = ");
        guess = input.nextInt();
        result = guess1.CheckGuess(guess);

        if(result == 0) {
            System.out.println("Correct guess!!");
        }
        else if (result < 0) {
            System.out.println("Guess higher");
        }
        else {
            System.out.println("Guess lower");
        } 
      } while(result != 0); 
    }
}