import java.util.Scanner;
public class WeightConvertor {
    public static void main(String[] args){

        int option;
        double weight;
        double newWeight;

        System.out.println("Weight conversion program!");
        System.out.println("1. Convert kgs into lbs");
        System.out.println("2. Convert lbs into kgs");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if(option==1){
            System.out.print("Enter a weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight*2.204623;
            System.out.printf("The new weight in lbs is: %.2f",newWeight);
        }
        else if (option ==2) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight*0.4535924;
            System.out.printf("The new weight in kgs is: %.2f",newWeight);
        }
        else
            System.out.println("You've entered an invalid option!");

        scanner.close();
    }
}
