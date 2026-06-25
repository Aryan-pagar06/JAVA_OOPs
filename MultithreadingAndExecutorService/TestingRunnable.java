public class TestingRunnable
{
    public static void main(String[] args) {

        RunnableExample p1 = new RunnableExample('*');
        RunnableExample p2 = new RunnableExample('$');
        RunnableExample p3 = new RunnableExample('#');

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        
        

    }
}