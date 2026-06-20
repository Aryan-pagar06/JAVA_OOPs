public class StringConcatenate
{
    public static void main(String[] args) {
         System.out.println(StrCon("Aryan" , "Pankaj", "Pagar"));
         System.out.println(StrCon("This" , "Is", "An", "Example", "Of", "Concatenation"));
    }

    public static String StrCon (String ... str) {
         StringBuilder sb = new StringBuilder ();
         for(String s : str) {
            sb.append(s);
         }

         return sb.toString();
    }
}