import java.util.Scanner;
public class sumoftwonumber{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter teh second number");
        int b=sc.nextInt();
        int sum =a+b;
        System.out.println("The sum of"+a+"and"+b+"b"+"is:"+sum);
    }
}
}