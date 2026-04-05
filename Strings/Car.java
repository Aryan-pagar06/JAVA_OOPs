public class Car
{
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car (int noOfWheels,int noOfDoors,int maxSpeed,String name,
                           String modelNumber,String company) {
    this. noOfWheels = noOfWheels;
    this.noOfDoors = noOfDoors;
    this.maxSpeed = maxSpeed;
    this.name = name;
    this.modelNumber = modelNumber;
    this.company = company;
    }

    @Override
    public String toString() {
        return "Car name : " + name + " which has " + noOfDoors + " doors"; 
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120, "Swift", "SW1234", "Maruti");
        Car bmw = new Car(4, 4, 300, "bmw", "BM2342", "BMW");
        System.out.println(swift.toString());
        System.out.println(swift);
        System.out.println(bmw);    
    }
}
