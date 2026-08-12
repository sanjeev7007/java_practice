import java.util.Arrays;
import java.util.Scanner;
public class median_of_two_sorted_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of first array :");
        int n1 = sc.nextInt();
        int num1 [] = new int[n1];
        System.out.println("Enter the first array");
        for (int i=0; i<n1; i++){
            num1 [i]= sc.nextInt();
        }

        System.out.print("Enter the length of Second array : ");
        int n2 = sc.nextInt();
        int num2 [] = new int[n2];
        System.out.println("Enter the second array : ");
        for (int i = 0; i<n2;i++){
            num2 [i]=sc.nextInt();
        }

        int[] mrgarr=  new int [num1.length+num2.length];
        for (int i = 0; i < num1.length; i++){
            mrgarr[i] = num1[i];
        }
        for (int j = 0; j < num2.length; j++){
            mrgarr[num1.length + j] = num2[j];
        }
        Arrays.sort(mrgarr);
        System.out.print("merged array = "+ Arrays.toString(mrgarr));
        int length = mrgarr.length;
        if(mrgarr.length%2==0 ){
            int r = (length/2)-1;
            int i1 = length-2-r;
            int i2 = length-1-r;
            double median = (mrgarr[i1]+mrgarr[i2] / 2.0);
            System.out.print("median is "+median);
        }
        else{
            double median = length / 2;
            System.out.print("median is "+median);
        }
        
    }

}
