import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops1 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        while (N >= 2 && N <= 20) {
            int i;
            int result;
            String x = "x";
            String equals = "=";
            for (i = 1; i <= 10; i++) {
                result = N * i;
                System.out.printf("%-2d%s %d = %-3d\n", N, x, i, result);
            }
            break;
        }

        bufferedReader.close();
    }
}
