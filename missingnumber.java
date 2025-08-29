import java.util.Arrays;
public class missingnumber{
    public static void main(String[] args){
        int arr[] ={1,2,3,5};
        Arrays.sort(arr);
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i] != i+1) {
                System.out.println("Missing number is: " + (i + 1));
                return;
            }
        }
        System.out.println( "missing number" + (arr.length + 1));

    }
}