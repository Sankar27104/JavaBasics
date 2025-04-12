import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int q =n;
        int result = 0;
        int remainder = 0;
        while (q!=0){
            remainder = q%10;
            result = result*10+remainder;
            q=q/10;

        }
        if(result==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
