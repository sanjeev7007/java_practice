import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean isanagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();  
        str2 = str2.replaceAll("\\s", "").toLowerCase();  

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String input1 = sc.nextLine();

        System.out.print("Enter second string: ");  
        String input2 = sc.nextLine();

        if (isanagram(input1, input2)) {
            System.out.println(input1 + " and " + input2 + " are anagrams.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not anagrams.");
        }

        sc.close();
    }
}
