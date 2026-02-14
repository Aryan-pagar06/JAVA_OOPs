public class mobile
{
    String colour;
    float price;
    mobile(String colour) // parameter constructor
    {
       this.colour=colour;
       price=100000;
    } 
    public void display()
    {
        System.out.println(colour);
        System.out.println(price);
        
    }
    public static void main(String[] args) {
        mobile c1= new mobile("red"); // compulsory to pass an arg 
        c1.display();
    }
}