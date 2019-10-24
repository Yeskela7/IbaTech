package homeworks.homework9;

import homeworks.homework9.family.CollectionFamilyDao;
import homeworks.homework9.family.Family;
import homeworks.homework9.humans.Man;
import homeworks.homework9.humans.Woman;
import homeworks.homework9.pets.Dog;

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

        CollectionFamilyDao list = new CollectionFamilyDao();
        list.saveFamily(sen);
        System.out.println(list.getAllFamilies());
    }
}
