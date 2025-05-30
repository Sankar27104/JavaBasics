import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = "";
        s = scanner.nextLine();
        s= s.trim();
        if(s.length()==0){
            System.out.println(0);
            return;
        }
        String[] letters = s.split("[^a-zA-Z]+");
        System.out.println(letters.length);
        for(String letter : letters){
            System.out.println(letter);
        }
        scanner.close();
    }
}
