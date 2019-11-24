package homeworks.homework13.exceptions;

import homeworks.homework13.Date.DateConverter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logging {

    private String path = "";
    private Date date = new Date();

    public Logging(String path) {
        this.path = path;
    }

    private String getPath() {
        return path;
    }

    public void info(String message) throws FileNotFoundException {
        try {
            FileWriter log = new FileWriter(this.getPath(), true);
            log.write(DateConverter.millsToString(date.getTime()) + " [INFO] " + message);
            log.write("\n");
            log.flush();
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void error(Exception ex, String action) throws FileNotFoundException {
        try {
            FileWriter log = new FileWriter(path, true);
            log.write(DateConverter.millsToString(date.getTime()) + " [ERROR] " + action + ": ");
            log.write(String.valueOf(ex));
            log.write("\n");
            log.flush();
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
