package homeworks.homework7.pets;

import homeworks.homework7.Species;

public final class Dog extends Pet implements Foulible {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Dog() {
        this.species = Species.DOG;;
    }

    public Dog(String nickname) {
        this.species = Species.DOG;
        this.nickname = nickname;
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.DOG;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    @Override
    public Species getSpecies() {
        return species;
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }

    static void foul() {
        System.out.println("I need to cover it up\n");
    }

}
