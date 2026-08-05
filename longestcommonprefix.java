import java.util.Scanner;

public class longestcommonprefix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length : ");
        int n = sc.nextInt();
        System.out.println("Enter the String array : ");
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        String prefix=str[0];
        for(int i=1;i<n;i++) {
            while (!str[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
            }
        }
    }
}