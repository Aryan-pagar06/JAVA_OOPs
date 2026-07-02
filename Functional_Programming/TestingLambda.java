
public class TestingLambda {

    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        test.sum(5, 10);
        test.printString("Im learning functional programming");

        //how lambda functions help?? in writing one line functions

        // toPrint -> System.out.println("Hello world!"); 

        // (a,b) -> a + b;

        // (a,b) -> { int sum;
        //sum = a + b
        // System.out.println(sum);
        //}
    }

    //traditional method of writing functions, too much work
    public void printString(String str) {
        System.out.println(str);
    }

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
