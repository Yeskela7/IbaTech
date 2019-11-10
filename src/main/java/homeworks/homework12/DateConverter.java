package homeworks.homework12;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConverter {

    private static SimpleDateFormat formatForDate = new SimpleDateFormat("dd/MM/yyyy");

    public static String format(long mills) {
        return formatForDate.format(mills);
    }

    public static String millsToString(Long mills) {
        return formatForDate.format(mills);
    }

    public static long stringToMills(String string) throws ParseException {
        try {
            return formatForDate.parse(string).getTime();
        } catch (ParseException ex) {
            throw new ParseException("Incorrect input. enter date in format: dd/MM/yyyy", 0);
        }
    }


}
