public class Car extends Vehicle 
{
    private int noOfDoors;
   
    @Override
    public void start() {
      System.out.println("Dhurrrr.."); 
    }

    @Override
    public void getSetGo() {
      System.out.println("yeyyy.."); 
    }


    public Car(int noOfDoors) {
        super(4);
        this.noOfDoors = noOfDoors;
    }

    public void display() {
        System.out.println(noOfDoors);
    }

}