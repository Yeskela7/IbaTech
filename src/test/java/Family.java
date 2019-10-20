import java.util.Arrays;
import java.util.Random;

public class Family {

    private Human father = new Human();
    private Human mother = new Human();
    private Pet pet = new Pet();
    private Human[] children;
    private int childNumber;


    public Family() {
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[childNumber];
        this.pet = pet;
    }


    void addChild(Human child) {
        this.children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        this.childNumber++;

    }

    void deleteChild(int index) {
        Human[] newChildren = new Human[this.children.length - 1];
        System.arraycopy(this.children, 0, newChildren, 0, index);
        System.arraycopy(this.children, index + 1, newChildren, index, this.children.length - index - 1);
        this.children = newChildren;
    }

    @Override
    public String toString() {
        if (childNumber == 0 && pet.getSpecies() == null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    '}';
        } else if (childNumber == 0 && pet.getSpecies() != null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother  +
                    ", pet=" + pet +
                    '}';
        } else if (childNumber > 0 && pet.getSpecies() == null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", children=" + Arrays.toString(children) +
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
}
