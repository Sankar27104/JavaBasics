import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}