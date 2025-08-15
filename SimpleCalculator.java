import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b != 0) result = a / b;
                else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
