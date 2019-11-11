package homeworks.homework12;

import homeworks.homework12.dao.controller.FamilyController;
import homeworks.homework12.humans.Human;
import homeworks.homework12.humans.HumanBuilder;
import homeworks.homework12.humans.Man;
import homeworks.homework12.humans.Woman;
import homeworks.homework9.family.Family;

import java.text.ParseException;
import java.util.Scanner;

public class Console{



    public Console console() throws ParseException {
        int command=-1;
        FamilyController controller = new FamilyController();
        while (command !=0){
            listOfCommand();
            command = input();
            switch (command){
                case 1:controller.createFamilies(10); break;
                case 2:controller.displayAllFamilies(); break;
                case 3:int bigger = input(); controller.getFamiliesBiggerThan(bigger); break;
                case 4:int less = input(); controller.getFamilyLessThan(less); break;
                case 5:int number = input(); controller.countFamiliesWithMemberNumber(number); break;
                case 6:Man father = (Man) dataAbout("Father"); Woman mother = (Woman) dataAbout("Mother"); controller.createNewFamily(father,mother); break;
                case 7:int id = inputId("delete");controller.deleteFamilyByIndex(id); break;
                case 8:  break;
                case 9: break;
                case 0: break;

            }
        }
    }


    private static String listOfCommand(){
        final StringBuilder sb = new StringBuilder("Enter your command:\n");
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

    private static int input(){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Enter number: ");
        return number;
    }

    private static Human dataAbout(String s) throws ParseException {
        HumanBuilder hb = new HumanBuilder();
        Scanner in = new Scanner(System.in);
        System.out.printf("Please, enter info about %s", s);
        System.out.println("Name: ");
        String name = in.nextLine();
        System.out.println("Surname: ");
        String surname = in.nextLine();
        System.out.println("Birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        System.out.println("Iq: ");
        int iq = in.nextInt();
        return new Human(name,surname,birthDate,iq);
    }

    private static int inputId(String s){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter family Id to %s", s);
        return in.nextInt();
    }

}
