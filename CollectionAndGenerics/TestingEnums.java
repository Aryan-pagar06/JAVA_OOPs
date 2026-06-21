public class TestingEnums
{
    public static void main(String[] args) {
        TrafficLightEnum colour = TrafficLightEnum.RED;
        System.out.println(colour.getAction()); //Stop
        for (TrafficLightEnum t : TrafficLightEnum.values()) { //for iterating we use values()
            System.out.println(t + ": " + t.getAction());
        }
        TrafficLightEnum t = TrafficLightEnum.valueOf("GREEN"); //string -> enum
        System.out.println(t);

    }
}