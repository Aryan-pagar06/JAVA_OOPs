public class ThreadState extends Thread 
{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("\nThread is in - %s ", Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}