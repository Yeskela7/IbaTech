package homeworks.homework4;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Rock", 5, 50, new String[]{"eat, drink, sleep"});
        Human father  = new Human("Frank","Smith", 1970) ;
        Human mother = new Human("Maria","Smith", 1970);
        Human child = new Human("Richard","Smith", 1995, 100, dog, father, mother, new String[1][1]);
        //TODO fix
        //System.out.println(father);

        System.out.println(child);
        System.out.println(child.feedPet());
    }
}
