package homeworks.homework7;

import homeworks.homework7.humans.Man;
import homeworks.homework7.humans.Woman;
import homeworks.homework7.pets.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Boss", 2, 23, new String[]{"eat", "sleep"});
        Man father = new Man("Frank", "Sinatra", 1915,121);
        Woman mother = new Woman("Barbara", "Sinatra", 1919,110);

        Family sen = new Family(father, mother, dog);
        sen.bornChild();
        System.out.println(sen);
        father.repairCar();
        mother.makeup();
    }
}
