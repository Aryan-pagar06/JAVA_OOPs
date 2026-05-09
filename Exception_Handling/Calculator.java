
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division calculator");
        System.out.print("Enter two numbers = ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try {
            int[] arr = new int[5];
            System.out.println(arr[6]); //Array index out of bound exception handled by throwable
            arr[6] = num1 / num2;    //Arithmetic exception if num2 == 0 handled by catch block
            System.out.println("Result = " + arr[6]);
        } catch (ArithmeticException exception) {
            System.out.printf("%s, enter valid values", exception.getMessage());
        } catch (Throwable th) {
            System.out.println(th.getMessage());
            throw th;
        }
    }
}
