package homeworks.homework13.humans;

import homeworks.homework13.DayOfWeek;

import java.text.ParseException;
import java.util.Map;

public final class Man extends Human {

    public Man(String name, String surname, String birthDate) throws ParseException {
        super(name, surname, birthDate);
    }

    public Man() {
    }

    public Man(String name, String surname, String birthDate, int iq) throws ParseException {
        super(name, surname, birthDate, iq);
    }

    public Man(String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule)
            throws ParseException {
        super(name, surname, birthDate, iq, schedule);
    }

    void greetPet() {
        System.out.printf("Hello, %s\n", this.getPet().getNickname());
    }

    public void repairCar() {
        System.out.println("I'll repair my summer car");
    }
}
