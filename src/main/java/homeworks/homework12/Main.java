package homeworks.homework12;

import homeworks.homework12.dao.controller.FamilyController;
import homeworks.homework12.family.Family;
import homeworks.homework12.humans.Man;
import homeworks.homework12.humans.Woman;
import homeworks.homework12.pets.Dog;

import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ParseException {


        HashSet<String> habits = new HashSet<String>() {{
            add("eat");
            add("play");
        }};
        Dog dog = new Dog("Boss", 2, 23, habits);
        Map<DayOfWeek, String> schedule = new HashMap<DayOfWeek, String>() {{
            put(DayOfWeek.MONDAY, "repair the car");
        }};

        Man father = new Man("Frank", "Sinatra", "12/02/1980", 121, schedule);
        Woman mother = new Woman("Barbara", "Sinatra", "12/02/1987", 110);
        Man father1 = new Man("Victor", "Sinra", "04/06/1988", 121);
        Woman mother1 = new Woman("Samantha", "Sinra", "22/03/1990", 110);
        Man child = new Man("Vas", "Savas", "13/11/2008", 121);

        FamilyController controller = new FamilyController();
        Family family = new Family(father, mother);
        controller.addFamily(family);
        controller.bornChild(family, "John", "Samante");
        controller.adoptChild(family, child);
        controller.displayAllFamilies();


    }
}
