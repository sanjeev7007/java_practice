import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int revs = 0; 
            while (num != 0) {
                int digit = num % 10;
                revs = revs * 10 + digit;
                num /= 10;
            }
            System.out.println("Reversed Number: " + revs);
        }
    }
}
