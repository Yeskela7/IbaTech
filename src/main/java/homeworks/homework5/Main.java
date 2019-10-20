package homeworks.homework5;


public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Rock", 5, 50, new String[]{"eat, drink, sleep"});
        Human grandfather = new Human();
        Human father = new Human("Frank", "Sinatra", 1915);
        Human mother = new Human("Barbara", "Sinatra", 1919);
        Human child1 = new Human("Nancy", "Sinatra", 1940, 100, new String[1][1]);
        Human child2 = new Human("Toni", "Sinatra", 1943, 101, new String[][]{{"Day_1", "Task_1"}, {"Day_2", "Task_2"}});

        //checking
        Family sinatraFamily = new Family(father, mother);
        System.out.println(sinatraFamily);
        sinatraFamily.addChild(child1);
        System.out.println(sinatraFamily);
        System.out.println(father.getFamily());
        sinatraFamily.addChild(child2);
        System.out.println(child2.getFamily());
        sinatraFamily.deleteChild(0);
        System.out.println(mother.getFamily());
    }
}
