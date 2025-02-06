import java.util.Scanner;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            System.out.print("Enter the third number: ");
            int c = sc.nextInt();
            int largest = a;
            if (b > largest) {
                largest = b;
            }
            if (c > largest) {
                largest = c;
            }
            System.out.println("The largest number is: " + largest);
        }
    }
}
