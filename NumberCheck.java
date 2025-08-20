import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0)
            System.out.println(num + " is positive.");
        else if (num < 0)
            System.out.println(num + " is negative.");
        else
            System.out.println("The number is zero.");
    }
}
