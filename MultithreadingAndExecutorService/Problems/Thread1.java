public class Thread1 extends Thread
{
    private final int x;

    public Thread1(int x) {
        this.x = x;
    }
    

   @Override
   public void run() {
    for(int i=0; i<10; i++) {
        System.out.printf("\n%d - Hello from Thread %d\n" , i+1 ,x);
    }
   }
}