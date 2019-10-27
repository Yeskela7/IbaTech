package homeworks.homework9;

import homeworks.homework9.daoSystem.FamilyService;
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

        Man father = new Man("Frank", "Sinatra", 1980, 121, schedule);
        Woman mother = new Woman("Barbara", "Sinatra", 1980, 110);
        Man father1 = new Man("Victor", "Sinra", 1915, 121);
        Woman mother1 = new Woman("Samanta", "Sinra", 1919, 110);

        FamilyService list = new FamilyService();
        list.createNewFamily(father,mother);
        list.createNewFamily(father1,mother1);
        System.out.println(list.countFamiliesWithMemberNumber(2));
//        list.bornChild(sen,"Markus","Sara");
//        list.bornChild(sen,"Tom","Flora");
        list.displayAllFamilies();
        list.getFamiliesBiggerThan(2);
//        list.displayAllFamilies();
//        list.count();
//        list.addPet(1,dog);
//        list.displayAllFamilies();

    }
}
