package homeworks.homework7.pets;

import homeworks.homework7.Species;

public final class Fish extends Pet{


    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    //constructor
    public Fish() {
        this.species = Species.FISH;
    }

    public Fish(String nickname) {
        this.species = Species.FISH;
        this.nickname = nickname;
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.FISH;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }
}
