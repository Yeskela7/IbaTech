package homeworks.homework4;

class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    static void eat(){
        System.out.println("I am eating");
    }

    static void respond(String nickname){
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", nickname);
    }

    static void foul(){
        System.out.println("I need to cover it up");
    }
}
