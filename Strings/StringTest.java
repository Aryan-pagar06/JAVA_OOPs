public class StringTest
{
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder ("This is a sentence!!");
        sentence.append ("Added new words");
        sentence.append(".      blahh");
        System.out.println(sentence);

    }
}