public class ExtendingThreadClass
{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting First Thread");
        t1.start(); //all threads get start and run parallel along with main thread 
        System.out.println("\nStarting Second Thread");
        t2.start(); 
        System.out.println("\nStarting Third Thread");
        t3.start();
        
        
        long endTime = System.currentTimeMillis();

        System.out.printf("Time taken : %d ", endTime -  startTime);
    }  
}