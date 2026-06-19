import java.util.LinkedList;
import java.util.Queue;

public class Queues
{
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        System.out.println(queue.peek());
        queue.remove();
        for (Integer i : queue) {
            System.out.println(i);
        }
    }
}