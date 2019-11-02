package homeworks.homework9;

import homeworks.homework9.dao.controller.FamilyController;
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

        controller.addFamily(family);
        controller.createNewFamily(father1, mother1);
        controller.bornChild(family, "Simon", "Sara");
        controller.adoptChild(family, child);
        controller.count();
        controller.addPet(0, dog);
        controller.createNewFamily(father1, mother1);
        controller.displayAllFamilies();
        controller.getPets(0);
        controller.deleteAllChildrenOlderThen(18);
        controller.deleteFamilyByIndex(1);
        controller.getFamilyById(0);
        controller.countFamiliesWithMemberNumber(2);
        controller.getFamiliesBiggerThan(1);
        controller.getFamilyLessThan(3);
        controller.getAllFamilies();
        controller.displayAllFamilies();


    }
}
