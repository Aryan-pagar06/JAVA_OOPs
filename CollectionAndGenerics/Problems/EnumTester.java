public class EnumTester
{
    public static void main(String[] args) {
        
        for(DaysEnum d : DaysEnum.values()) {
             System.out.println(d + ": " + d.indication);
        }

    }
}