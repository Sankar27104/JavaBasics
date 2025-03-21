import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Income:");
        int income=scanner.nextInt();

        String className = income>100000 ? "First Class" : "Economy";
        System.out.println(className);
    }
}
