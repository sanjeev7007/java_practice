import java.util.Scanner;
public class ArmstrongNumber {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int digits=0;
        int sum=0;
        int temp=number;
        while (temp!=0) {
            temp = temp / 10;
            digits++;
        }
        temp = number;
        while (temp!= 0) {
            int lastdigit = temp % 10;
            sum += Math.pow(lastdigit, digits);
            temp = temp / 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number");
        }
        sc.close();
    }
}