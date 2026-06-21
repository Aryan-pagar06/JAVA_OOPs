



public enum TrafficLightEnum
{
    RED("Stop"), GREEN("Go"), YELLOW("Slow down");

    private final String action;

    private TrafficLightEnum(String action) {
        this.action = action;
    }

    public String getAction () {
        return this.action;
    }

    
}