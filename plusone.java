import java.util.Arrays;
import java.util.Scanner;
public class plusone {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Length: ");
        int n = sc.nextInt();
        System.out.println("Enter the array :");
        int[] digits=new int[n];
        for(int i =0 ; i<n;i++){
            digits[i]=sc.nextInt();
        }
        int nums=0;
        for (int sum : digits){
            nums = nums * 10 + sum;
        }
        nums = nums+1;
        String str = String.valueOf(nums);
        int [] plusone = new int[str.length()];
        for (int i=0 ;i < str.length();i++){
            plusone[i]=str.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(plusone));
        
    }
}
