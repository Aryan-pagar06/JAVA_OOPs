
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class PrintNumberEs
{
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintNumbers task = new PrintNumbers();
        service.submit(task);
        service.shutdown();
    }
}