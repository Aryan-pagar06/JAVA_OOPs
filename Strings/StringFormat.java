public class StringFormat
{
    public static void main(String[] args) {
        String name = "ram";
        int marks = 90;
        int marks2=12345;
        System.out.println("Hello " + name + " your marks are = " + marks); // more memory used in string pool
        System.out.printf("Hello %s , your marks are = %d", name, marks);
        System.out.println("");
         System.out.printf("Hello %S , your marks are = %d", name, marks);
         System.out.println("");
         System.out.printf("Hello %5S , your marks are = %d", name, marks);
         System.out.println("");
         System.out.printf("Hello %-15S , your marks are = %05d", name, marks);
         System.out.printf("Hello %-15S , your marks are = %0,5d", name, marks2);
    }
}