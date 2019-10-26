package homeworks.homework9.pets;

import java.util.Set;

public final class Dog extends Pet implements Foulible {

    public Dog() {
        super.setSpecies(Species.DOG);
    }

    public Dog(String nickname) {
        super(nickname);
        super.setSpecies(Species.DOG);
    }

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.DOG);
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up\n");
    }
}
