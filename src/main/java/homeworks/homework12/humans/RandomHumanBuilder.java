package homeworks.homework12.humans;

import homeworks.homework12.DateConverter;

import java.text.ParseException;
import java.util.Calendar;

public class RandomHumanBuilder {
    private String manName;
    private String womanName;
    private String surname;
    private String birthDateInString;
    private int iq;

    public RandomHumanBuilder withManName() {
        ManNames name = new ManNames();
        manName = name.getManName();
        return this;
    }

    public RandomHumanBuilder withWomanName() {
        WomanNames name = new WomanNames();
        womanName = name.getWomanName();
        return this;
    }

    public RandomHumanBuilder withSurname() {
        SurnameRandom surnameRandom = new SurnameRandom();
        surname = surnameRandom.getRandomSurname();
        return this;
    }

    public String withBirthDate() {
        birthDateInString = DateConverter.millsToString((long) (Calendar.getInstance().
                getTimeInMillis() * ((Math.random() * 0.3) + 0.3)));
        return birthDateInString;
    }

    public RandomHumanBuilder withIq() {
        iq = (int) (Math.random() * 80 + 80);
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
