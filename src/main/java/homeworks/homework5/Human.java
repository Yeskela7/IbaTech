package homeworks.homework5;

import java.util.Arrays;
import java.util.Random;

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;

    private Family family;

    public Family getFamily() {
        return family;
    }

    public Human(Family family, String name) {
        this.name = name;
        this.family = family;
    }
//TODO fix family info
    public void setFamily(Family family) {
        this.family = family;
    }


    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        if (name == null) {
            return "no info\n";
        } else if (iq == 0) {
            return "Human{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", family=" + family +
                    "}";
        } else if (schedule[0][0] == null) {
            return "Human{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", family=" + family +
                    "}";
        } else {
            return "Human{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    ", schedule=" + Arrays.deepToString(schedule) +
                    ", family=" + family +
                    "}";
        }

    }

    Human() {
    }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = getFamily();
    }

    Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = getFamily();
    }
}
