package homeworks.homework9.humans;

import homeworks.homework9.DayOfWeek;

import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman() {
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void greetPet() {
        System.out.printf("Hello, %s\n", this.getPet().getNickname());
    }

    public void makeup() {
        System.out.println("Makeup time!");
    }
}
