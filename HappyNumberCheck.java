import java.util.Scanner;

public class HappyNumberCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (isHappyNumber(num)) {
                System.out.println(num + " is a Happy Number!");
            } else {
                System.out.println(num + " is NOT a Happy Number.");
            }
        }
    }

    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);            
            fast = sumOfSquares(sumOfSquares(fast)); 
        } while (slow != fast);

        return slow == 1;
    }

    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
