import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExtendedMortgageCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int principle = 0;
        float annualInterestRate = 0;
        byte period =0;
        byte monthsInYear = 12;
        byte percent =100;
        float monthlyInterestRate =0;
        int numberOfPayments=0;

        while(true) {
            System.out.print("Principle ($1K-$1M): ");
            principle = scanner.nextInt();
            if (principle >= 1000 && principle<=1000000)
                break;
            System.out.println("Enter an amount between $1k and $1M");
        }
        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if(annualInterestRate>=0 && annualInterestRate<=30){
                monthlyInterestRate = annualInterestRate/monthsInYear/percent;
                break;
            }
            System.out.println("Enter a number between 0 to 30");
        }
        while (true){
            System.out.print("Period (years): ");
            period = scanner.nextByte();
            if (period>0 && period<=30){
                numberOfPayments = period*monthsInYear;
                break;
            }
            System.out.println("enter a number between 1 to 30");
        }
        double mortgage = principle*(monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberOfPayments))/(Math.pow(1+monthlyInterestRate, numberOfPayments)-1);
        String mortageFormatted=NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortage: "+ mortageFormatted);
    }
}