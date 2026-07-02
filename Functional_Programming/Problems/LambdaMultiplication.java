
import java.util.function.BinaryOperator;

public class LambdaMultiplication
{
    public static void main(String[] args) {
        BinaryOperator <Integer> product = (a,b) -> a * b;
       System.out.println(product.apply(4, 5));
        
    }
}