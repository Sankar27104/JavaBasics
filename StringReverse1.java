import java.util.Scanner;

public class StringReverse1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        StringBuilder sb = new StringBuilder(A);
        if(sb.reverse().toString().equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
