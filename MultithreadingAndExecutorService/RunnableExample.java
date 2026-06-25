public class RunnableExample implements Runnable
{
    @Override
    public void run() {
         //print task
        for(int i=1; i<=1000; i++) {
            System.out.printf("%d-%c  ", i, TargetChar);
        }
        System.out.printf("\n%s %c task complete", Thread.currentThread().getName(), TargetChar);
    }

    private final char TargetChar;

    public RunnableExample(char TargetChar) {
        this.TargetChar = TargetChar;
    }

}