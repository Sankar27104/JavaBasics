import java.util.Calendar;

public class CalendarClass{
    public static void main(String args[]){
        Calendar cal = Calendar.getInstance();
        System.out.print("Calendar Date: ");
        int date = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH)+1;
        //In the Calender method the january month is considered a 0, So that we have to add a number to the month.
        int year = cal.get(Calendar.YEAR);
        System.out.println(date+"-"+month+"-"+year);

        System.out.print("Current time: ");
        int hours = cal.get(Calendar.HOUR);
        int minutes = cal.get(Calendar.MINUTE);
        int seconds = cal.get(Calendar.SECOND);
        System.out.println(hours+":"+minutes+":"+seconds);

        int x = cal.get(Calendar.AM_PM);
        if(x==0)
            System.out.println("Good Morning!");
        else
            System.out.println("Good Evening!");
    }
}