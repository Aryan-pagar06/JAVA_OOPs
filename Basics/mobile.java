public class mobile
{
    String colour;
    float price;
    mobile(String colour) // parameter constructor
    {
       this.colour=colour;
       price=100000;
    } 
    mobile ()
    {
        this("Black"); // chaining
        price=0;
    }
    public void display()
    {
        System.out.println(colour);
        System.out.println(price);
        
    }
    public static void main(String[] args) {
        mobile c1= new mobile("red");
        mobile c2 = new mobile(); // compulsory to pass an arg 
        c1.display();
        c2.display();
    }
}