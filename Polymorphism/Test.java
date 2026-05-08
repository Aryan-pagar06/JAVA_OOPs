public class Test
{
    public static void main(String[] args) {
        Car c = new Car();
       // Vehicle v = new Vehicle();
        Vehicle vCar = new Car(); //polymorphism + upcasting
        Plane p = new Plane();
      //  Car c2 = new Vehicle(); compile time error (trying to downcast)
        // c.Display();
        // v.Display();
        // vCar.Display();
      //  castingTest(v);
        castingTest(c);
        castingTest(p);
        
        
    }

    public static void castingTest(Vehicle v) {
        v.Display();
    }
}