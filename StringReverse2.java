import java.util.Scanner;

public class StringReverse2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        int start = 0;
        int end = A.length()-1;
        boolean isPalindrome=true;
        while(start<=end) {
            if (A.charAt(start) != A.charAt(end)) {
                isPalindrome = false;
            }
            start++;
            end--;
        }
        if(isPalindrome)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
