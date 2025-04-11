import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Swapping without temp
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping:");
            System.out.println("First number: " + a);
            System.out.println("Second number: " + b);
        } // sc is auto-closed here
    }
}
