package homeworks.homework7.humans;

public final class Man extends Human {

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man() {
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    void greetPet() {
        System.out.printf("Hello, %s\n", getFamily().getPet().getNickname());
    }

    public void repairCar() {
        System.out.println("I'll repair my summer car");
    }
}
