package homeworks.homework7.pets;


import homeworks.homework7.Species;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {

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

    public void setSpecies(Species species) {
        this.species = species;
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
        this.species = Species.UNKNOWN;
    }

    public Pet(String nickname) {
        this.species = Species.UNKNOWN;
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.UNKNOWN;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public static void eat() {//++
        System.out.println("I am eating\n");
    }

    abstract void respond();

    @Override
    public String toString() {
        return "Pet{" + "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    public boolean equals(Object that) {
        if (this.hashCode() == that.hashCode()) return true;
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
        return species.hashCode() * age * nickname.hashCode() * trickLevel * -11;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize " + this);
        super.finalize();
    }
}
