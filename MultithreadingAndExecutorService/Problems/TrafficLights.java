public enum TrafficLights 
{
    RED(10000), GREEN(5000), YELLOW(3000);
    
    long time;

    private TrafficLights(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }
    
}