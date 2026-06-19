public abstract class Vehicle implements Transportation
{
    private int noOfTires;
    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public abstract void start (); //abstract method

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute () {
        System.out.println("Moving.......");
    }


}