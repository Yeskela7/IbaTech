package homeworks.homework7.humans;

public final class Woman extends Human {

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman() {
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    void greetPet() {
        System.out.printf("Hello, %s\n", getFamily().getPet().getNickname());
    }
}
