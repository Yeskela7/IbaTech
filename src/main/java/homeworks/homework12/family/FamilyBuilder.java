package homeworks.homework12.family;

import homeworks.homework12.humans.Human;
import homeworks.homework12.humans.RandomHumanBuilder;

import java.text.ParseException;

public class FamilyBuilder {
    private Human father;
    private Human mother;

    RandomHumanBuilder randomHumanBuilder = new RandomHumanBuilder();


    public FamilyBuilder withFather() throws ParseException {
        father = randomHumanBuilder.buildMan();
        return this;
    }

    public FamilyBuilder withMother() throws ParseException {
        mother = randomHumanBuilder.buildWoman();
        mother.setSurname(this.father.getSurname());
        return this;
    }

    public Family build() throws ParseException {
        withFather();
        withMother();
        return new Family(father, mother);
    }
}
