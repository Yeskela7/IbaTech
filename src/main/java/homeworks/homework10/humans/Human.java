package homeworks.homework10.humans;

import homeworks.homework10.DayOfWeek;
import homeworks.homework10.family.Family;
import homeworks.homework10.pets.Pet;

import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Map<DayOfWeek, String> schedule;

    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Pet getPet() {
        return pet;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {
    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public String getSurname() {
        return surname;
    }

    public int getIq() {
        return iq;
    }

    public int getYear() {
        return year;
    }

    boolean feedPet() {
        Random random = new Random();
        int trick = random.nextInt(101);
        int petTrick = pet.getTrickLevel();
        if (trick < petTrick) {
            System.out.printf("Hm... I will feed  %s\n", pet.getNickname());
            return true;
        } else {
            System.out.printf("I think %s is not hungry.", pet.getNickname());
            return false;
        }
    }

    void describePet() {
        if (pet.getTrickLevel() >= 50) {
            System.out.printf("I have a %s, he is %d years old, he is very sly\n",
                    pet.getSpecies(), pet.getAge());
        } else {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly\n",
                    pet.getSpecies(), pet.getAge());
        }
    }

    void greetPet() {
        System.out.printf("Hello, %s\n", pet.getNickname());
    }

    @Override
    public boolean equals(Object that) {
        if (this.hashCode() == that.hashCode()) return true;
        if (that == null || getClass() != that.getClass()) return false;
        if (this == that) return true;
        Human human = (Human) that;
        return year == human.year &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * surname.hashCode() * year * -11;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize " + this);
        super.finalize();
    }

    @Override
    public String toString() {
        if (name == null) {
            return "no info\n";
        } else if (iq == 0) {
            return this.getClass().getSimpleName() +
                    "{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    "}";
        } else if (schedule == null) {
            return this.getClass().getSimpleName() +
                    "{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    "}";
        } else {
            return this.getClass().getSimpleName() +
                    "{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    ", schedule=" + schedule +
                    "}";
        }
    }
}
