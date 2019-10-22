package homeworks.homework6;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet(Species.CAT, "Jarly", 5, 50, new String[]{"eat", "sleep"});
        Human grandfather = new Human();
        Human father = new Human("Frank", "Sinatra", 1915);
        Human mother = new Human("Barbara", "Sinatra", 1919);
        Human child1 = new Human("Nancy", "Sinatra", 1940, 100, new String[][]{{DayOfWeek.MONDAY.name(), "Task_1"}, {DayOfWeek.THURSDAY.name(), "Task_2"}});

        System.out.println("Checking start");
        for (int i = 0; i < 1000000; i++) {
            Human human = new Human("Fin", "Alize", i);
            System.out.println(human);
        }

        System.out.println(child1);
        System.out.println(father);
        Family family = new Family(father, mother);
        System.out.println(family);
        family.addChild(child1);
        family.deleteChild(0);
        System.out.println(Arrays.toString(family.getChildren()));
    }
}
