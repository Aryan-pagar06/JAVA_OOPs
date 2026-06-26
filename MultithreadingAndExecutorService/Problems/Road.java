public class Road
{
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficLights.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficLights.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficLights.GREEN);

        red.start();
        red.join();
        green.start();
        green.join();
        yellow.start();
        
        
    }
}