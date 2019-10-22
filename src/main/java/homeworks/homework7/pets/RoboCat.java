package homeworks.homework7.pets;

import homeworks.homework7.Species;

public final class RoboCat extends Pet implements Foulible {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    //constructor
    public RoboCat() {
        this.species = Species.ROBOCAT;;
    }

    public RoboCat(String nickname) {
        this.species = Species.ROBOCAT;//++
        this.nickname = nickname;
    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        this.species = Species.ROBOCAT;
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
