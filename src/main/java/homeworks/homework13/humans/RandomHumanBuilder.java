package homeworks.homework13.humans;

import homeworks.homework13.Date.DateConverter;

import java.text.ParseException;
import java.util.Calendar;

public class RandomHumanBuilder {
    private String manName;
    private String womanName;
    private String surname;
    private String birthDateInString;
    private int iq;

    private RandomHumanBuilder withManName() {
        ManNames name = new ManNames();
        manName = name.getManName();
        return this;
    }

    private RandomHumanBuilder withWomanName() {
        WomanNames name = new WomanNames();
        womanName = name.getWomanName();
        return this;
    }

    private RandomHumanBuilder withSurname() {
        SurnameRandom surnameRandom = new SurnameRandom();
        surname = surnameRandom.getRandomSurname();
        return this;
    }

    private String withBirthDate() {
        birthDateInString = DateConverter.millsToString((long) (Calendar.getInstance().
                getTimeInMillis() * (Math.random() * 0.5)));
        return birthDateInString;
    }

    private RandomHumanBuilder withIq() {
        iq = (int) (Math.random() * 100 + 60);
        return this;
    }

    public Man buildMan() throws ParseException {
        withManName();
        withSurname();
        withBirthDate();
        withIq();
        return new Man(manName, surname, birthDateInString, iq);
    }

    public Woman buildWoman() throws ParseException {
        withWomanName();
        withSurname();
        withBirthDate();
        withIq();
        return new Woman(womanName, surname, birthDateInString, iq);
    }
}
