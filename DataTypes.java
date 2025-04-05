import java.util.Scanner;

public class DataTypes {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<=n;i++){

            try{
                long x = scanner.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) {
                    System.out.println("* Byte");
                    System.out.println("* Short");
                    System.out.println("* Int");
                }
                else if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) {
                    System.out.println("* Short");
                    System.out.println("* Int");
                } else if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
                    System.out.println("* Int");
                }
                System.out.println("* Long");
            }
            catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
