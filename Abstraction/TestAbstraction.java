public class TestAbstraction {
    public static void main(String[] args) {
        // Vehicle v1 = new Vehicle (2); //shows error cuz abstract class objects cant be created
        Car c1 = new Car(4);
        c1.display();
        c1.commute();
        c1.start();
        
    }
}