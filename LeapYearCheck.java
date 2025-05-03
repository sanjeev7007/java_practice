import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            boolean isLeap = false;

            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    isLeap = true;
                }
            }

            if (isLeap) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
    }
}
