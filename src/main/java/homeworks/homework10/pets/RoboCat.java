package homeworks.homework10.pets;

import homeworks.homework10.pets.Foulible;
import homeworks.homework10.pets.Pet;
import homeworks.homework10.pets.Species;

import java.util.Set;

public final class RoboCat extends Pet implements Foulible {

    public RoboCat() {
        super.setSpecies(Species.ROBOCAT);
    }

    public RoboCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.ROBOCAT);
    }

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up\n");
    }
}