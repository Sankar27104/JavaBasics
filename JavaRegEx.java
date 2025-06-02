import java.util.Scanner;

public class JavaRegEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex{
    String reg = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4]|[0-9]|25[0-5])";
    public String pattern = reg+"."+reg+"."+reg+"."+reg;
}
