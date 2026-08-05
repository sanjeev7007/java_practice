import java.util.Scanner;
class Test11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println("Enter the Array Length : ");
        int n = sc.nextInt();
        int num[]= new int[n];
        System.out.print("Enter the num array : ");
        for (int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("num Length : "+ num.length);
        //System.out.println("String Length : "+str.length());
        
    }

}