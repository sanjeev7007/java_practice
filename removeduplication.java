import java.util.*;
import java.util.Arrays;
public class removeduplication {
    public static void main(String [] args){
        int n = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int k = sc.nextInt();
        int nums[] = new int[k];
        for (int i=0;i<k;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("[" + nums[0]);

        for (int i=1;i<k;i++){
                if(nums[i] != nums[i-1]){
                    System.out.print(","+nums[i]);
                    n = n+1;
                }
            }
        System.out.println("]");
        System.out.println("k = "+n );
        }

    }

