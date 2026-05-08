public class Car extends Vehicle{
    
    Car(int noOfTires) {
        super(noOfTires); 
    }

    Car() {
        super();
    }

   @Override
    public void Display() {
        super.getNoOfTires();
        System.out.println("Car print");
    }

}