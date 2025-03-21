import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat()/100;

        System.out.print("Period (Years): ");
        int time = scanner.nextInt()*12;

        double mortgage = (principle * interest * time) / (1 - Math.pow(1 + interest, -time));
        System.out.println("Mortage: "+NumberFormat.getCurrencyInstance().format(mortgage));


    }
}