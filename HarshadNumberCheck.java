import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (isHarshad(number)) {
                System.out.println(number + " is a Harshad Number.");
            } else {
                System.out.println(number + " is not a Harshad Number.");
            }
        }
    }

    // Method to check if a number is a Harshad Number
    public static boolean isHarshad(int num) {
        int sum = 0;
        int temp = num;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10; // Add last digit to sum
            temp /= 10;       // Remove last digit
        }

        // Check if the original number is divisible by the sum of its digits
        return num % sum == 0;
    }
}
