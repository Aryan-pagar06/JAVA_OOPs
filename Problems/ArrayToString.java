import  java.util.Scanner;
public class ArrayToString 
{
   public static String[] ArrayInput() {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of words = ");
      int size = input.nextInt();
      String [] arrayOFwords = new String[size];
      for(int i=0; i<size; i++) {
        System.out.print("Enter word " + (i+1) + " = ");
        arrayOFwords[i] = input.next();
      }
     return arrayOFwords;
   }

   public static void main(String[] args) {
       String[] array = ArrayInput();
       StringBuilder sb = new StringBuilder();
       for(String word : array ) {
        sb.append(word).append(" ");
       }
       System.out.print(sb);
   }
}
