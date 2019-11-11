package homeworks.homework12.humans;

import java.text.ParseException;

public class HumanBuilder {
    private String name;
    private String surname;
    private String birthDateInString;
    private int iq;

    public HumanBuilder withName(String enter){
        name = enter;
        return this;
    }
    public HumanBuilder withSurname(String enterSurname){
        surname = enterSurname;
        return this;
    }
    public HumanBuilder withDate(String enterDate){
        birthDateInString = enterDate;
        return this;
    }
    public HumanBuilder withIq(int enterIq){
        iq = enterIq;
        return this;
    }

    public Man buildMan() throws ParseException {
        return new Man(name,surname,birthDateInString,iq);
    }

    public Woman buildWoman() throws ParseException {
        return new Woman(name,surname,birthDateInString,iq);
    }
}
