
import java.util.concurrent.Callable;

public class FactorialCall implements Callable<Integer> 
{
    private final Integer num;

    public FactorialCall(Integer num) {
        this.num = num;
    }

     @Override
     public Integer call() {
        Integer fact=1;
        for(int i=1; i<=num; i++) {
           fact =  fact * i;
        }
        return fact;
     }
}