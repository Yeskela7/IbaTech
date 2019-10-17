package homeworks.homework4;

import java.util.Random;

class Human {
    private  String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother.name + " " +  mother.surname +
                ", father=" + father.name + " " + father.surname +
                '}';
    }

    public Human() {
    }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    boolean feedPet(){
        boolean feeding = false;
        Random random = new Random();
        int trick = random.nextInt(101);
        int petTrick = pet.trickLevel;
        //System.out.println(trick);
        if(trick < petTrick){
            feeding =true;
            System.out.printf("Hm... I will feed  %s\n", pet.nickname);
        }else {
            feeding = false;
            System.out.println("I think Jack is not hungry.\n");
        }
        //System.out.println(feeding);
        return feeding;
    }

    void describePet(){
        if(pet.trickLevel >= 50){
            System.out.printf("I have a %s, he is %d years old, he is very sly", pet.species, pet.age);
        }else{
            System.out.printf("I have a %s, he is %d years old, he is almost not sly", pet.species, pet.age);
        }
    }
}
