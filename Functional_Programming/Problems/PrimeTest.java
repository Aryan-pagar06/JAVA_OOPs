public class PrimeTest
{
    public static void main(String[] args) {
        Candidate c = num -> {
            for(int i=2; i<num; i++) {
                if(num % 2 == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(c.isCandidate(3));
    }
}