import java.text.NumberFormat;

public class Test {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(3456789);
        System.out.println(result);
    }
}
