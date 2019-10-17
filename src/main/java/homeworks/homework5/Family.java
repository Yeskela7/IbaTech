package homeworks.homework5;

import java.util.Arrays;
import java.util.Random;

public class Family {

    private Human father = new Human();
    private Human mother = new Human();
    private Human[] children = new Human[0];
    private Pet pet = new Pet();

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Family{" + "father=" + father +
                ", mother=" + mother +
                '}';
    }




    boolean feedPet(){
        Random random = new Random();
        int trick = random.nextInt(101);
        int petTrick = pet.getTrickLevel();
        //System.out.println(trick);
        if(trick < petTrick){
            System.out.printf("Hm... I will feed  %s\n", pet.getNickname());
            return true;
        }else {
            System.out.println("I think Jack is not hungry.");
            return false;
        }

    }
    void describePet(){
        if(pet.getTrickLevel() >= 50){
            System.out.printf("I have a %s, he is %d years old, he is very sly\n", pet.getSpecies(), pet.getAge());
        }else{
            System.out.printf("I have a %s, he is %d years old, he is almost not sly\n", pet.getSpecies(), pet.getAge());
        }
    }
    void greetPet(){
        System.out.printf("Hello, %s\n", pet.getNickname());
    }
}
