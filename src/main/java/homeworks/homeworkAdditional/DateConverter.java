package homeworks.homeworkAdditional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConverter {

    private static Date date = new Date();
    private static SimpleDateFormat formatForDate = new SimpleDateFormat("dd/MM/yyyy");

    static String millsToString(Long mills) {
        return formatForDate.format(mills);
    }

    static long stringToMills(String string) throws ParseException {
        try {
            return formatForDate.parse(string).getTime();
        } catch (ParseException ex){
            throw new ParseException ("Incorrect input. enter date in format: dd/MM/yyyy",0);
        }
    }

    static String describeAge(Long birthAge) {
        Calendar calendar = Calendar.getInstance();
        Long def = calendar.getTimeInMillis() - birthAge;
        calendar.setTimeInMillis(def);
        int year = calendar.get(Calendar.YEAR) - 1970;
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH) - 1;
        return year + " year " + month + " month " + day + " day ";
    }


    public static void main(String[] args) throws ParseException {

        System.out.println(Calendar.getInstance().getTimeInMillis());

        System.out.println(describeAge(815256000000L));
        System.out.println(Calendar.getInstance().getTime());
        System.out.println(stringToMills("02/11/1995"));
        System.out.println(millsToString(815256000000L));

    }
}
