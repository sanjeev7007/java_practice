import java.util.Scanner;

public class NumberToWordsConverter {
    private static final String[] units = {
        "Zero", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine"
    };

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.print("In words: ");
            printNumberInWords(number);
        }
    }

    public static void printNumberInWords(int number) {
        if (number == 0) {
            System.out.println(units[0]);
            return;
        }

        if (number < 0) {
            System.out.print("Minus ");
            number = -number;
        }

        String numberStr = Integer.toString(number);
        for (char digit : numberStr.toCharArray()) {
            int d = digit - '0';
            System.out.print(units[d] + " ");
        }
    }
}
