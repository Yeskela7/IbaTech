package homeworks.homework7;

import homeworks.homework7.humans.Human;
import homeworks.homework7.pets.Pet;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human father;
    private Human mother;
    private Pet pet;
    private Human[] children;

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Pet getPet() {
        return pet;
    }


    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }


    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
        this.pet = pet;
        father.setFamily(this);
        mother.setFamily(this);

    }


    public void addChild(Human child) {
        this.children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        child.setFamily(this);
    }

    public void deleteChild(int index) {
        if (index > children.length - 1) {
            this.children = children;
        } else {
            Human[] newChildren = new Human[this.children.length - 1];
            System.arraycopy(this.children, 0, newChildren, 0, index);
            System.arraycopy(this.children, index + 1, newChildren, index, this.children.length - index - 1);
            this.children = newChildren;
        }
    }

    public int countFamily() {
        return 2 + this.children.length;
    }

    @Override
    public String toString() {
        if (this.children.length == 0 && pet.getSpecies() == null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    '}';
        } else if (this.children.length == 0 && pet.getSpecies() != null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", pet=" + pet +
                    '}';
        } else if (this.children.length != 0 && pet.getSpecies() == null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", children=" + Arrays.toString(children) +
                    ", people in family=" + this.countFamily() +
                    '}';
        } else {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", pet=" + pet +
                    ", children=" + Arrays.toString(children) +
                    '}';
        }
    }


    @Override
    public boolean equals(Object that) {
        if(this.hashCode() == that.hashCode()) return true;
        if (that == null || getClass() != that.getClass()) return false;
        if (this == that) return true;
        Family family = (Family) that;
        return Objects.equals(father, family.father) &&
                Objects.equals(mother, family.mother) &&
                Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(father, mother);
        result = 11 * result + Arrays.hashCode(children) * children.length * -1;
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this);
        super.finalize();
    }
}
