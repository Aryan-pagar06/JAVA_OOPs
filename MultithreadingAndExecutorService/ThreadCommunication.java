public class ThreadCommunication  //will learn basic methods
{
   public static void main(String[] args) throws InterruptedException {
       //putting main thread to sleep
       System.out.println("Before sleeping");
       Thread.sleep(10000); //sleeps for 10 seconds
       System.out.println("Woke up");

   }
}