import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        String[] words = sentence.split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}
