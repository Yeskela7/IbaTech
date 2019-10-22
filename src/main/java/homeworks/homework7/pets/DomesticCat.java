package homeworks.homework7.pets;

import homeworks.homework7.Species;

public final class DomesticCat extends Pet implements Foulible {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    //constructor
    public DomesticCat() {
        this.species = Species.DOMESTICCAT;;
    }

    public DomesticCat(String nickname) {
        this.species = Species.DOMESTICCAT;//++
        this.nickname = nickname;
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.DOMESTICCAT;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }

    static void foul() {
        System.out.println("I need to cover it up\n");
    }
}
