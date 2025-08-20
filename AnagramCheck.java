import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine().toLowerCase().replaceAll("\\s", "");

        System.out.print("Enter second string: ");
        String str2 = input.nextLine().toLowerCase().replaceAll("\\s", "");

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");
    }
}
