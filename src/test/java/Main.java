public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Rock", 5, 50, new String[]{"eat, drink, sleep"});
        Human grandfather = new Human();
        Human father = new Human("Frank", "Sinatra", 1915);
        Human mother = new Human("Barbara", "Sinatra", 1919);
        Human child = new Human("Nancy", "Sinatra", 1940, 100, new String[1][1]);
        Human child1 = new Human("Toni", "Sinatra", 1943, 101, new String[][]{{"Day_1", "Task_1"}, {"Day_2", "Task_2"}});

        Family sen = new Family(father,mother);
        System.out.println(child);
        sen.addChild(child);
        System.out.println(sen);
    }
}
