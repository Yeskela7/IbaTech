package homeworks.homeworkAdditional.testing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTesting {

    private long birthDay;

    private static Date date = new Date();
    private static SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd/MM/yyyy");

    public static Date getDate() {
        return date;
    }

    public static SimpleDateFormat getFormatForDateNow() {
        return formatForDateNow;
    }

    public long getBirthDayInMills() {
        return birthDay;
    }

    public void setBirthDay(long birthDay) {
        this.birthDay = birthDay;
    }



    public static String getBirthDay(long birtDate){
        return formatForDateNow.format(birtDate);
    }


}
