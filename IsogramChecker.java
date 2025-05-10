import java.util.Scanner;
import java.util.HashSet;

public class IsogramChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine().toLowerCase();

            if (isIsogram(word)) {
                System.out.println("The word is an isogram.");
            } else {
                System.out.println("The word is not an isogram.");
            }
        }
    }

    public static boolean isIsogram(String word) {
        HashSet<Character> seen = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                if (seen.contains(c)) {
                    return false;
                }
                seen.add(c);
            }
        }
        return true;
    }
}
