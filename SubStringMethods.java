import java.util.Scanner;

public class SubStringMethods {
    public static void main(String[] args){
        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            System.out.println("Username is "+username);

            domain = email.substring(email.indexOf("@")+1);
            System.out.println("Domain of the email is: " +domain);
        }
        else
            System.out.println("Email must contain '@'");

        scanner.close();
    }
}
