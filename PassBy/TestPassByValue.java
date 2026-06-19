public class TestPassByValue
{
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int sum = add(x,y);
        System.out.printf("x = %d, y = %d, sum = %d ",x,y,sum);
    }

    public static int add (int a, int b) {
       // a = a+b; //a changes but x doesnt
          a=67;
        return a;
    }
}