
//Simple switch case example
public class SwitchCase {
    public static void main(String[] args){
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("you're a moderator");
                break;
            default:
                System.out.println("you're a guest");
                break;
        }
    }
}
