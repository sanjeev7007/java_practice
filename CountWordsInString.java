import java.util.Scanner;

public class CountWordsInString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String input = scanner.nextLine();

            String[] words = input.trim().split("\\s+");
            int wordCount = words.length;

            System.out.println("Total number of words: " + wordCount);
        }
    }
}
