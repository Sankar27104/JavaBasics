import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }

        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return String.valueOf(arr1).equals(String.valueOf(arr2));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}