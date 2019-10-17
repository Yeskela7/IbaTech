package homeworks.homework4;

import java.util.Arrays;

class Pet {

    String species;
    String nickname;
    int age;
    int trickLevel;
    private String[] habits;

    @Override
    public String toString() {
        return species +"{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    Pet() {
    }

    static void eat(){
        System.out.println("I am eating\n");
    }

    void respond(){
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", this.nickname);
    }

    static void foul(){
        System.out.println("I need to cover it up\n");
    }

}
