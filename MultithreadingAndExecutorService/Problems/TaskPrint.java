
public class TaskPrint implements Runnable {

    private int getRandom() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("\nCurrent Thread name : %s \n", current.getName());
        try {
            Thread.sleep(getRandom() * 1000); //sleeps for random 1-5 seconds
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("\nEnded Current Thread name : %s \n", current.getName());
    }

}
