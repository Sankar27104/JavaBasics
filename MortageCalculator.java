import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345673);
        System.out.println(result);

    }
}
