import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        String oddOrEven = number%2==0 ? "Even" : "Odd";
        System.out.println(oddOrEven);
    }
}
