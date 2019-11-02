package homeworks.homework10;

import homeworks.homework10.dao.controller.FamilyController;
import homeworks.homework10.family.Family;
import homeworks.homework10.humans.Man;
import homeworks.homework10.humans.Woman;
import homeworks.homework10.pets.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        HashSet<String> habits = new HashSet<String>() {{
            add("eat");
            add("play");
        }};
        Dog dog = new Dog("Boss", 2, 23, habits);
        Map<DayOfWeek, String> schedule = new HashMap<DayOfWeek, String>() {{
            put(DayOfWeek.MONDAY, "repair the car");
        }};

        Man father = new Man("Frank", "Sinatra", 1980, 121, schedule);
        Woman mother = new Woman("Barbara", "Sinatra", 1980, 110);
        Man father1 = new Man("Victor", "Sinra", 1915, 121);
        Woman mother1 = new Woman("Samantha", "Sinra", 1919, 110);
        Man child = new Man("Vas", "Savas", 1943, 121);

        FamilyController controller = new FamilyController();
        Family family = new Family(father, mother);



    }
}
