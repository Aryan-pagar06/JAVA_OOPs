
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TaskPrintEs
{
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        
        TaskPrint task1 = new TaskPrint();
        TaskPrint task2 = new TaskPrint();
        TaskPrint task3 = new TaskPrint();
        TaskPrint task4 = new TaskPrint();
        TaskPrint task5 = new TaskPrint();

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.submit(task5);

        service.shutdown();

    }
}