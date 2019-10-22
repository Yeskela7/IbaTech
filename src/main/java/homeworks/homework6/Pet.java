package homeworks.homework6;


import java.util.Objects;

public class Pet {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public String getNickname() {
        return nickname;
    }

    public Species getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public Pet() {
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    static void eat() {
        System.out.println("I am eating\n");
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }

    static void foul() {
        System.out.println("I need to cover it up\n");
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || getClass() != that.getClass()) return false;
        if (this == that) return true;
        Pet pet = (Pet) that;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                species == pet.species &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return species.hashCode() * age * nickname.hashCode() * trickLevel * -1;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize " + this);
        super.finalize();
    }
}
