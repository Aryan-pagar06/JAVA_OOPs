public class Overloading
{
   public int sum (int a, int b) {
    return a + b;
   }

   public int sum (int a, int b, int c, int d) //method overloading
    {
        return a + b + c + d;
    }

    public String sum (String a, String b) {
        return a + b;
    }

    Overloading() {
        System.out.println("Default constructor called");
    }

    Overloading (String s) {    //constructor overloading
        System.out.println(s);
    }

   public static void main(String[] args) {
       Overloading ov = new Overloading();
       Overloading ov2 = new Overloading("Hello World");
       System.out.println(ov.sum(5,4));
       System.out.println(ov.sum(5,4,4,6));
       System.out.println(ov.sum("Aryan ", "Pagar"));
   }
}
