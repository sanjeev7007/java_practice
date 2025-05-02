import java.util.*;
public class SumOfDigits{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int sum = 0, original = num;
            while(num != 0) {
                sum += num%10;
                num /= 100;
            }
            System.out.println("sum of digits of " + original + " is: " + sum);
        }
    }
}