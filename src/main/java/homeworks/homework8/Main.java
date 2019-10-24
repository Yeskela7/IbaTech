package homeworks.homework8;

import homeworks.homework8.humans.Man;
import homeworks.homework8.humans.Woman;
import homeworks.homework8.pets.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashSet<String> habits = new HashSet<String>() {{
            add("sleep");
            add("eat");
        }};
        Dog dog = new Dog("Boss", 2, 23, habits);
        Map<DayOfWeek, String> schedule = new HashMap<DayOfWeek, String>() {{
            put(DayOfWeek.MONDAY, "repair the car");
        }};

        Man father = new Man("Frank", "Sinatra", 1915, 121, schedule);
        Woman mother = new Woman("Barbara", "Sinatra", 1919, 110);

        Family sen = new Family(father, mother, dog);
        sen.bornChild();
        System.out.println(sen);
        father.repairCar();
        mother.makeup();
        System.out.println(schedule.get(DayOfWeek.MONDAY));
    }
}
