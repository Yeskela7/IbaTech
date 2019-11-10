package homeworks.homework12.family;

import homeworks.homework12.DateConverter;
import homeworks.homework12.Printable;
import homeworks.homework12.humans.*;
import homeworks.homework12.pets.Pet;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

public class Family implements HumanCreator, Printable {

    private Human father;
    private Human mother;
    private ArrayList<Pet> pet;
    private ArrayList<Human> children;

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public ArrayList<Pet> getPet() {
        return pet;
    }

    public ArrayList<Human> getChildren() {
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
        return prettyFormat();
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

    @Override
    public String prettyFormat() {
        if (this.children.size() == 0 && pet.size() == 0) {
            return "Family\n" + "Father: " + father +
                    "\nMother: " + mother +
                    "\nPeople in family: " + this.countFamily();
        } else if (this.children.size() == 0 && pet.size() != 0) {
            return "Family\n" + " Father: " + father +
                    "\nMother: " + mother +
                    "\nPet: " + pet +
                    "\nPeople in family: " + this.countFamily();
        } else if (this.children.size() != 0 && pet.size() == 0) {
            return "Family\n" + "Father: " + father +
                    "\nMother: " + mother +
                    "\nChildren: " + childPrettyFormat(children) +
                    "\nPeople in family: " + this.countFamily();
        } else {
            return "Family\n" + "Father: " + father +
                    "\nMother: " + mother +
                    "\nPet: " + pet +
                    "\nChildren: " + childPrettyFormat(children) +
                    "\nPeople in family: " + this.countFamily();
        }
    }

    private StringBuilder childPrettyFormat(ArrayList<Human> children) {
        StringBuilder result = new StringBuilder();
        for (Human child : children) {
            if (child instanceof Man) {
                result.append("\n--- boy: ").append(child.prettyFormat());
            } else {
                result.append("\n--- girl: ").append(child.prettyFormat());
            }
        }
        return result;
    }
}
