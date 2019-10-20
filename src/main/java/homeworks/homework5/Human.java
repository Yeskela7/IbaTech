package homeworks.homework5;

import java.util.Arrays;

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;

    private Family family;

    Family getFamily() {
        return family;
    }

    void setFamily(Family family) {
        this.family = family;
    }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human() {
    }

    Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
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
                    "}";
        } else if (schedule[0][0] == null) {
            return "Human{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    "}";
        } else {
            return "Human{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    ", schedule=" + Arrays.deepToString(schedule) +
                    "}";
        }
    }
}
