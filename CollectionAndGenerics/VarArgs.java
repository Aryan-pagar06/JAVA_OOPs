
public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sum(7, 8));
        System.out.println(sum(5,6,7, 2));
        System.out.println(sum(5,6,7,8,9,89,49,0,-100));
        VarArgs call = new VarArgs();
        call.print("Aryan" , "Pankaj", "Om", "Rahul");

         //System.out.println(sum());
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int ... a) { //variable arguments
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }

    public void print(String ... str) {
        for(String s : str) {
            System.out.println(s);
        }
    }


    // public static int sum(int[] arr) { //for adding many ints but not making methods
    //     int sum = 0;
    //     for (int i : arr) {
    //         sum = sum + i;
    //     }
    //     return sum;
    // }
}
