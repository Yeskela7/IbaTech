package homeworks.homework10.family;

import homeworks.homework10.DateConverter;
import homeworks.homework10.humans.*;
import homeworks.homework10.pets.Pet;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Family implements HumanCreator {

    private Human father;
    private Human mother;
    private ArrayList<Pet> pet;
    private List<Human> children;

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public ArrayList<Pet> getPet() {
        return pet;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
        this.pet = new ArrayList<>();
        father.setFamily(this);
        mother.setFamily(this);
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public void deleteChild(int index) {
        children.get(index).setFamily(null);
        children.remove(index);
    }

    public int countFamily() {
        return 2 + children.size();
    }

    @Override
    public String toString() {
        if (this.children.size() == 0 && pet.size() == 0) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", people in family=" + this.countFamily() +
                    "}\n";
        } else if (this.children.size() == 0 && pet.size() != 0) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", pet=" + pet +
                    ", people in family=" + this.countFamily() +
                    "}\n";
        } else if (this.children.size() != 0 && pet.size() == 0) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", children=" + children +
                    ", people in family=" + this.countFamily() +
                    "}\n";
        } else {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", pet=" + pet +
                    ", children=" + children +
                    ", people in family=" + this.countFamily() +
                    "}\n";
        }
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || getClass() != that.getClass()) return false;
        if (this == that) return true;
        Family family = (Family) that;
        return Objects.equals(father, family.father) &&
                Objects.equals(mother, family.mother) &&
                Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(father, mother);
        result = 11 * result + children.size() * children.size() * -1;
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this);
        super.finalize();
    }

    public void bornChild() throws ParseException {
        int random = (int) (Math.random() * 100);
        int iq = (father.getIq() + mother.getIq()) / 2;
        String year = DateConverter.millsToString(Calendar.getInstance().getTimeInMillis());
        if (random <= 50) {
            ManNames name = new ManNames();
            Man childMan = new Man(name.getManName(), father.getSurname(), year, iq);
            this.addChild(childMan);
        } else {
            WomanNames name = new WomanNames();
            Woman childWoman = new Woman(name.getWomanName(), father.getSurname(), year, iq);
            this.addChild(childWoman);
        }
    }
}
