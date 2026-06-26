

public class TrafficLightThread extends Thread 
{
    private final TrafficLights colour;

    public TrafficLightThread(TrafficLights colour) {
        this.colour = colour;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n", colour);
        try {
           Thread.sleep(colour.getTime()); 
        } catch (InterruptedException e) {
           System.out.println(e.getMessage());
        }
        System.out.printf("%s inactive\n", colour);
    }

}