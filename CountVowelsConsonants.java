import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine().toLowerCase();

            int vowels = 0, consonants = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }
}
