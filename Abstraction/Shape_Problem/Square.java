public class Square extends Shape 
{
    private float side;

     Square(float side) {
        this.side = side;
    }
    
    @Override
    public void calculateArea()
    {
      System.out.println("Area of square is = " + (side * side));
    }
}