public class ThreadTester 
{
    public static void main (String[] args) throws InterruptedException {
        //problem 1 - print thread x
        Thread1 t1 = new Thread1(1);
        Thread1 t2 = new Thread1(2);
        t1.start();
        t2.start();

        //problem 2 - getState
        ThreadState t = new ThreadState();
        System.out.printf("\nCreate the thread : %s ", t.getState());
        t.start();
        t.join();
        System.out.printf("\nThread Finished: %s ", t.getState());

    }
}