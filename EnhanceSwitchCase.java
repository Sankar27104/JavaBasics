import java.util.Scanner;

public class EnhanceSwitchCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = scanner.nextLine().toUpperCase();
        System.out.println(day);

        switch (day){
            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> System.out.println(day + " is a weekday");
            case "SATURDAY","SUNDAY" -> System.out.println(day + " is a weekend");
            default -> System.out.println(day + " is not a day");
        }
        scanner.close();
    }
}
