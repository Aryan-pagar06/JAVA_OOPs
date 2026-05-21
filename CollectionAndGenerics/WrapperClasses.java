public class WrapperClasses
{
    public static void main(String[] args) {
       // Integer a = new Integer(55);
       Integer first = Integer.valueOf(55); //we can also put it in a string
       Integer a = 55; //one more method to do this, autoboxing
       System.out.println(first);
       int b = a; //unboxing
       System.out.println(b);
       
    }
}