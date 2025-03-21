import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!input.equals("quit")){
            System.out.print("Input:");
            input = scanner.next().toLowerCase();
            System.out.println(input);
            System.out.println("Enter \"quit\" to exit");
        }
    }
}