package homeworks.homework7.pets;

import homeworks.homework7.Species;

public final class Fish extends Pet {

    public Fish() {
        super.setSpecies(Species.FISH);
    }

    public Fish(String nickname) {
        super(nickname);
        super.setSpecies(Species.FISH);
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.FISH);
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }
}
