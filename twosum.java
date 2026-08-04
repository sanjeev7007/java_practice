import java.util.Scanner;
public class twosum {
    public static void main(String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the array Size : ");
            int n = sc.nextInt();
            int nums [] = new int[n];
            System.out.println("Enter the Array Elements : ");
            for (int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            System.out.println("Enter the Target Number : ");
            int target = sc.nextInt();
            for (int i=0;i<n;i++){
                for (int j=1 ;j<n;j++){
                    int sum = nums[i]+nums[j];
                    if(sum==target){
                        System.out.println(i +","+ j);
                        return;
                    }
                }
            }
        }
    }

}
