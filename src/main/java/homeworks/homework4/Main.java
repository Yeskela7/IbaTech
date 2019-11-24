package homeworks.homework4;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Rock", 5, 50, new String[]{"eat, drink, sleep"});
        Human grandfather = new Human();
        Human father = new Human("Frank", "Sinatra", 1915);
        Human mother = new Human("Barbara", "Sinatra", 1919);
        Human child = new Human("Nancy", "Sinatra", 1940, 100, dog, father, mother, new String[1][1]);


        System.out.println(child);
        child.describePet();
        child.greetPet();
        child.feedPet();
        System.out.printf("Grandfather %s ", grandfather);
        System.out.printf("Father %s \n", father);
        System.out.printf("Mother %s \n", mother);
    }
}
