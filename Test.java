import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Income: ");
        int income=scanner.nextInt();
        String className = income>10_000 ? "First_Class":"Economy";
        System.out.println(className);
    }
}