package homeworks.homework7;


import homeworks.homework7.humans.Human;
import homeworks.homework7.pets.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("sd", 2, 23, new String[]{"eat", "sleep"});
        Human grandfather = new Human();
        Human father = new Human("Frank", "Sinatra", 1915);
        Human mother = new Human("Barbara", "Sinatra", 1919);
        Human child1 = new Human("Nancy", "Sinatra", 1940, 100,
                new String[][]{{DayOfWeek.MONDAY.name(), "Task_1"}, {DayOfWeek.THURSDAY.name(), "Task_2"}});

        System.out.println(dog.getSpecies());
    }
}
