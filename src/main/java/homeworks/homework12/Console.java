package homeworks.homework12;

import homeworks.homework12.dao.controller.FamilyController;
import homeworks.homework12.humans.Human;
import homeworks.homework12.humans.HumanBuilder;
import homeworks.homework12.humans.Man;
import homeworks.homework12.humans.Woman;

import java.text.ParseException;
import java.util.Scanner;

public class Console{

    public void console() throws ParseException {
        int command=-1;
        FamilyController controller = new FamilyController();
        while (command !=0){
            message(listOfCommand());
            command = inputId("");
            switch (command){
                case 1:controller.createFamilies(10); break;
                case 2:controller.displayAllFamilies(); break;
                case 3:int bigger = inputId("number of member: "); controller.getFamiliesBiggerThan(bigger); break;
                case 4:int less = inputId("number of member: "); controller.getFamilyLessThan(less); break;
                case 5:int number = inputId("number of people in family: ");
                    System.out.println(controller.countFamiliesWithMemberNumber(number)); break;
                case 6:Man father = dataAboutFather(); Woman mother = dataAboutMother();
                        controller.createNewFamily(father,mother); break;
                case 7:int id = inputId("family Id to delete");controller.deleteFamilyByIndex(id); break;
                case 8:int c = inputId("next command.\n'1' - born child\n'2' - adopt child\n'3' - back to menu");
                                switch (c){
                                    case 1: int indexV = inputId("family id");
                                    String m = inputString("name for boy");
                                    String w = inputString("name for woman");
                                    controller.bornChild(indexV, m, w);break;
                                    case 2: int indexT = inputId("family id");
                                    Human child = dataAboutChild("child");
                                    controller.adoptChild(indexT, child);break;
                                    case 3: command = -1; break;
                                };break;
                case 9: int ageFilter = inputId("age filter");
                controller.deleteAllChildrenOlderThen(ageFilter); break;
                case 0: break;
            }
        }
    }

    private static String listOfCommand(){
        final StringBuilder sb = new StringBuilder("your command:\n");
        sb.append("1 - Fill with test data\n");
        sb.append("2 - Display the entire list of families\n");
        sb.append("3 - Display a list of families where the number of people is greater than the specified number\n");
        sb.append("4 - Display a list of families where the number of people is less than the specified number\n");
        sb.append("5 - Calculate the number of families where the number of members is \n");
        sb.append("6 - Create a new family\n");
        sb.append("7 - Delete a family by its index in the general list\n");
        sb.append("8 - Edit a family by its index in the general list\n");
        sb.append("9 - Remove all children over the age of majority\n");
        sb.append("0 - Exit\n");
        return sb.toString();
    }

    private static Man dataAboutFather() throws ParseException {
        HumanBuilder hb = new HumanBuilder();
        Scanner in = new Scanner(System.in);
        message("Please, enter info about father\n");
        message("name: ");
        String name = in.nextLine();
        message("surname: ");
        String surname = in.nextLine();
        message("birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        message("Iq: ");
        int iq = in.nextInt();
        return new Man(name,surname,birthDate,iq);
    }

    private static Woman dataAboutMother() throws ParseException {
        HumanBuilder hb = new HumanBuilder();
        Scanner in = new Scanner(System.in);
        message("Please, enter info about mother");
        message("name: ");
        String name = in.nextLine();
        message("surname: ");
        String surname = in.nextLine();
        message("birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        message("Iq: ");
        int iq = in.nextInt();
        return new Woman(name,surname,birthDate,iq);
    }

    private static Human dataAboutChild(String s) throws ParseException {
        HumanBuilder hb = new HumanBuilder();
        Scanner in = new Scanner(System.in);
        System.out.printf("Please, enter info about %s", s);
        message("name: ");
        String name = in.nextLine();
        message("surname: ");
        String surname = in.nextLine();
        message("birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        return new Human(name,surname,birthDate);
    }

    private static int inputId(String s){
        Scanner in = new Scanner(System.in);
        message(s);
        return in.nextInt();
    }

    private static String inputString(String s){
        Scanner in = new Scanner(System.in);
        message(s);
        return in.nextLine();
    }

    private static void message(String s){
        System.out.printf("Enter %s",s);
    }
}
