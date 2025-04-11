import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {

    /*     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    @org.jetbrains.annotations.NotNull
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance(); //Initializing the calendar class
        c.set(year, month-1, day); // Sets the values for the calendar field YEAR,MONTH, DAY_OF_MONTH
        return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,Locale.US).toUpperCase();
        /*DAY_OF_WEEK it will give the day of the week but return in integer value, to convert it to the week name
        getDisplayName(int field, int style, Locale Locale) is used.
        where field DAY_OF_WEEK and style represent the datatype when the date is "08052015" we have to use the long type(for every date in calendar class we have to use datatype LONG)
        Locale.US represents Sunday as first day where france represents Monday as first day.
         */
    }
}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
