package homeworks.homework13.exceptions;

import java.io.*;

public class Logging {

    private String path = "./homeworks/homework13/files/application.log";

    public void info(String message) throws FileNotFoundException {
        try {
            FileWriter log = new FileWriter(path, true);
            log.write(message);
            log.write("\n");
            log.flush();
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void info(Exception ex, String action) throws FileNotFoundException {
        try {
            FileWriter log = new FileWriter(path, true);
            log.write(String.valueOf(ex));
            log.write(action + ": ");
            log.write("\n");
            log.flush();
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
