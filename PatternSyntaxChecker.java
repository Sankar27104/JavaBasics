import java.util.Scanner;
import java.util.regex.*;
public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();  //Removes the leftover newline after the number input (important!).
        //or we can directly us int count = Integer.parseInt(scanner.nextLine());  // safer one-step
        while(count>0){
            String pattern = scanner.nextLine();
            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("valid");
            }
            catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
            count--;
        }
        scanner.close();
    }
}
