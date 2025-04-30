import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char result = findMostFrequentChar(input);
            System.out.println("Most frequent character: " + result);
        }
    }

    public static char findMostFrequentChar(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        str = str.replaceAll("\\s+", "").toLowerCase();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        char mostFreq = ' ';
        int max = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > max) {
                mostFreq = entry.getKey();
                max = entry.getValue();
            }
        }

        return mostFreq;
    }
}
