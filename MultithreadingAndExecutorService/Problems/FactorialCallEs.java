
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialCallEs
{
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(3);

        List <Future<Integer>> resultList = new ArrayList<>();

        for(int i=0; i<10; i++) {
            FactorialCall task = new FactorialCall(i);
            resultList.add(service.submit(task));
        }

        for(Future<Integer> result : resultList) {
           System.out.printf("Factorial : %d\n", result.get());
        }

        service.shutdown();

    }
}