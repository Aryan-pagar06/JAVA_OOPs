
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures
{
   public static void main(String[] args) throws Exception {
       ExecutorService service = Executors.newFixedThreadPool(2);
       FetchName task1 = new FetchName("Aryan");
       FetchName task2 = new FetchName("Pankaj");
       FetchName task3 = new FetchName("Manisha");
       FetchName task4 = new FetchName("Piyanki");
       FetchName task5 = new FetchName("Indian");

       Future<String> name1 = service.submit(task1);
       Future<String> name2 = service.submit(task2);
       Future<String> name3 = service.submit(task3);
       Future<String> name4 = service.submit(task4);
       Future<String> name5 = service.submit(task5);

       System.out.printf("\nName - %s", name1.get());
       System.out.printf("\nName - %s", name2.get());
       System.out.printf("\nName - %s", name3.get());
       System.out.printf("\nName - %s", name4.get());
       System.out.printf("\nName - %s", name5.get());

       service.shutdown();

   }
}