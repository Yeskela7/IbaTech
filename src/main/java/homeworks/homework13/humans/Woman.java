package homeworks.homework13.humans;

import homeworks.homework13.Date.DayOfWeek;

import java.text.ParseException;
import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, String birthDate) throws ParseException {
        super(name, surname, birthDate);
    }

    public Woman() {
    }

    public Woman(String name, String surname, String birthDate, int iq) throws ParseException {
        super(name, surname, birthDate, iq);
    }

    public Woman(String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule)
            throws ParseException {
        super(name, surname, birthDate, iq, schedule);
    }

    public void greetPet() {
        System.out.printf("Hello, %s\n", this.getPet().getNickname());
    }

    public void makeup() {
        System.out.println("Makeup time!");
    }
}
