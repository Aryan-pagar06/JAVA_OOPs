public class Circle extends Shape
{
   private double radius;

   Circle(int radius) {
    this.radius = radius;
   }
   
   @Override
   public void calculateArea() {
     System.out.println("Area is = " + (Math.PI * radius * radius));
   }
}