import java.util.Scanner;
class Test11 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int ans = i/j;
            System.out.print(ans);
        }
    }
}