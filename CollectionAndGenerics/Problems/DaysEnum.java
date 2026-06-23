public enum DaysEnum 
{
    MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday") ,
    THURSDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekend"), SUNDAY("Weekend");

    String indication;

     DaysEnum(String indication) {
        this.indication = indication;
    }
   
}