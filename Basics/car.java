public class car
{
    int NoOfSeats;
    float maxSpeed;
    String colour;
    float currentFuel;
    int NoOfWheels;

    public void driving()
    {
        System.out.println("Car is moving");
        currentFuel--;
    }
    public void addfuel(float fuel)
    {
        currentFuel=currentFuel+fuel;
    }
    public float getcurrentfuel()
    {
        return currentFuel;
    }

}