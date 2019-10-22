package homeworks.homework6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {

    private Human father;
    private Human mother;
    private Pet pet = new Pet();
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



    Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
        this.pet = pet;
        father.setFamily(this);
        mother.setFamily(this);

    }


    void addChild(Human child) {
        this.children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        child.setFamily(this);
    }

    void deleteChild(int index) {
        if(index > children.length - 1){
            this.children = children;
        }else {
            Human[] newChildren = new Human[this.children.length - 1];
            System.arraycopy(this.children, 0, newChildren, 0, index);
            System.arraycopy(this.children, index + 1, newChildren, index, this.children.length - index - 1);
            this.children = newChildren;
        }
    }

    int countFamily() {
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

    boolean feedPet() {
        Random random = new Random();
        int trick = random.nextInt(101);
        int petTrick = pet.getTrickLevel();
        //System.out.println(trick);
        if (trick < petTrick) {
            System.out.printf("Hm... I will feed  %s\n", pet.getNickname());
            return true;
        } else {
            System.out.printf("I think %s is not hungry.", pet.getNickname());
            return false;
        }

    }

    void describePet() {
        if (pet.getTrickLevel() >= 50) {
            System.out.printf("I have a %s, he is %d years old, he is very sly\n", pet.getSpecies(), pet.getAge());
        } else {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly\n", pet.getSpecies(), pet.getAge());
        }
    }

    void greetPet() {
        System.out.printf("Hello, %s\n", pet.getNickname());
    }


    @Override
    public boolean equals(Object that) {
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
        result = 21 * result + Arrays.hashCode(children) * children.length * -1;
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this);
        super.finalize();
    }
}
