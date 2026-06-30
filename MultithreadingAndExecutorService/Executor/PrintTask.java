public class PrintTask extends Thread
{
    private final char target;
    
    public PrintTask(char target) {
        this.target = target;
    }

   @Override
   public void run() {
    for(int i=1; i<=1000; i++) {
        System.out.printf("%d - %c", i, target);
    }
   }
}