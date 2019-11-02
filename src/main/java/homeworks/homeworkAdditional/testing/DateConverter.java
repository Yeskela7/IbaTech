package homeworks.homeworkAdditional.testing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    private static Date date = new Date();
    private static SimpleDateFormat formatForDate = new SimpleDateFormat("dd/MM/yyyy");

    private static SimpleDateFormat formatAge = new SimpleDateFormat("dd/MM/yyyy");


    public static long getDateInMills() {
        return date.getTime();
    }

    public static String getDate(){
        return formatForDate.format(date.getTime());
    }

    static String formatForDate(long date) {
        return formatForDate.format(date);
    }

    static String describeAge(long birthAge){
        long diff = date.getTime() - birthAge;
        int age = (int)(diff / (24*60*60*1000*365));
        return age + " 3";
    }
}
