
import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(isPerfectNumber(number)){
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }
        sc.close();
    }
    public static boolean isPerfectNumber(int num){
        if(num<=1){
            return false;
        }
        int sum=0;
        for (int i=1;i<= num/2;i++){
            if (num % i == 0) {
                sum += i;
            }
        }
    
        return sum == num;
    }}