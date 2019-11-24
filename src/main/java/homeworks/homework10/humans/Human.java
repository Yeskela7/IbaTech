package homeworks.homework10.humans;

import homeworks.homework10.DateConverter;
import homeworks.homework10.DayOfWeek;
import homeworks.homework10.family.Family;
import homeworks.homework10.pets.Pet;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Pet pet;
    private Map<DayOfWeek, String> schedule;

    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public Human(String name, String surname, String birthDate) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = DateConverter.stringToMills(birthDate);
    }

    public Human() {
    }

    public Human(String name, String surname, String birthDate, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = DateConverter.stringToMills(birthDate);
        this.iq = iq;
    }

    public Human(String name, String surname, String birthDate, int iq, Map<DayOfWeek, String> schedule)
            throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = DateConverter.stringToMills(birthDate);
        this.iq = iq;
        this.schedule = schedule;
    }

    public String getSurname() {
        return surname;
    }

    public int getIq() {
        return iq;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        long def = calendar.getTimeInMillis() - this.birthDate;
        calendar.setTimeInMillis(def);
        return calendar.get(Calendar.YEAR) - 1970;
    }

    public String describeAge() {
        Calendar calendar = Calendar.getInstance();
        long def = calendar.getTimeInMillis() - this.birthDate;
        calendar.setTimeInMillis(def);
        int year = calendar.get(Calendar.YEAR) - 1970;
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH) - 1;
        return year + " year " + month + " month " + day + " day";
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
        return birthDate == human.birthDate &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return (int) (name.hashCode() * surname.hashCode() * birthDate * -11);
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
                    ", birthDate=" + DateConverter.format(birthDate) +
                    "}";
        } else if (schedule == null) {
            return this.getClass().getSimpleName() +
                    "{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", birthDate=" + DateConverter.format(birthDate) +
                    ", iq=" + iq +
                    "}";
        } else {
            return this.getClass().getSimpleName() +
                    "{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", birthDate=" + DateConverter.format(birthDate) +
                    ", iq=" + iq +
                    ", schedule=" + schedule +
                    "}";
        }
    }
}
