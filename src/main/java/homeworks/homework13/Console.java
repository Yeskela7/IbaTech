package homeworks.homework13;

import homeworks.homework13.dao.controller.FamilyController;
import homeworks.homework13.exceptions.Logging;
import homeworks.homework13.humans.Human;
import homeworks.homework13.humans.HumanBuilder;
import homeworks.homework13.humans.Man;
import homeworks.homework13.humans.Woman;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Logging logger =
            new Logging("D:\\Git\\IbaTech\\src\\main\\java\\homeworks\\homework13\\files\\application.log");

    private String path =
            "D:\\Git\\IbaTech\\src\\main\\java\\homeworks\\homework13\\files\\family_data.bin";
    SaveLoader saveLoader = new SaveLoader(path);

    public void console() throws ParseException, FileNotFoundException {
        FamilyController fc = new FamilyController();
        while (true) {
            message(listOfCommand());
            switch (inputId("Enter the command")) {
                case 1:
                    fc.createFamilies(10);
                    message("Test data created");
                    logger.info("Test data creating");
                    break;
                case 2:
                    fc.displayAllFamilies();
                    logger.info("Display All Families");
                    break;
                case 3:
                    fc.getFamiliesBiggerThan(inputId("Enter number of member: "));
                    logger.info("Get Families Bigger Than");
                    break;
                case 4:
                    fc.getFamilyLessThan(inputId("Enter number of member: "));
                    logger.info("Get Family Less Than");
                    break;
                case 5:
                    System.out.println(fc.countFamiliesWithMemberNumber
                            (inputId("Enter number of people in family: ")));
                    logger.info("Count Families With Member Number");
                    break;
                case 6:
                    try {
                        fc.createNewFamily(dataAboutFather(), dataAboutMother());
                        logger.info("Create New Family");
                    } catch (Exception ex) {
                        message("Incorrect input");
                        logger.error(ex, "Create New Family");
                    }
                    break;
                case 7:
                    fc.deleteFamilyByIndex(inputId("Enter family Id to delete"));
                    logger.info("Delete Family By Index");
                    break;
                case 8:
                    int c = inputId("Enter next command.\n'1' - born child\n'2' - adopt child\n'3' - back to menu\n");
                    switch (c) {
                        case 1:
                            try {
                                fc.bornChild(inputId("Enter family id"),
                                        inputString("Enter name for boy "),
                                        inputString("Enter name for girl "));
                                logger.info("bornChild");
                            } catch (NullPointerException ex) {
                                message("Wrong family index");
                                logger.error(ex, "Born child");
                            }
                            break;
                        case 2:
                            try {
                                fc.adoptChild(inputId("Enter family id "), dataAboutChild());
                                logger.info("Adopt child");
                            } catch (NullPointerException ex) {
                                message("Wrong family index");
                                logger.error(ex, "Adopt child");
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 9:
                    int ageFilter = inputId("Enter age filter");
                    fc.deleteAllChildrenOlderThen(ageFilter);
                    logger.info("delete All Children Older Then");
                    break;
                case 10:
                    saveLoader.saveToFile(fc);
                    logger.info("Save data");
                    break;
                case 11:
                    try {
                        fc.load(saveLoader.loadFromFile());
                        logger.info("Load data");
                    } catch (NullPointerException ex) {
                        message("No data in file");
                        logger.error(ex, "No data in file");
                    }
                    break;
                case -1:
                    message("Incorrect input");
                    break;
                case 0:
                    System.exit(0);
                    logger.info("Exit done");
                    break;
            }
        }
    }

    private static String listOfCommand() {
        final StringBuilder sb = new StringBuilder("Main\n");
        sb.append("1 - Fill with test data\n");
        sb.append("2 - Display the entire list of families\n");
        sb.append("3 - Display a list of families where the number of people is greater than the specified number\n");
        sb.append("4 - Display a list of families where the number of people is less than the specified number\n");
        sb.append("5 - Calculate the number of families where the number of members is \n");
        sb.append("6 - Create a new family\n");
        sb.append("7 - Delete a family by its index in the general list\n");
        sb.append("8 - Edit a family by its index in the general list\n");
        sb.append("9 - Remove all children over the age of majority\n");
        sb.append("10 - Save data\n");
        sb.append("11 - Load data\n");
        sb.append("0 - Exit\n");
        return sb.toString();
    }

    private static Man dataAboutFather() throws ParseException {
        HumanBuilder hb = new HumanBuilder();
        Scanner in = new Scanner(System.in);
        message("Please, enter info about father\n");
        message("Enter name: ");
        String name = in.nextLine();
        message("Enter surname: ");
        String surname = in.nextLine();
        message("Enter birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        message("Enter Iq: ");
        int iq = in.nextInt();
        return new Man(name, surname, birthDate, iq);
    }

    private static Woman dataAboutMother() throws ParseException {
        HumanBuilder hb = new HumanBuilder();
        Scanner in = new Scanner(System.in);
        message("Please, enter info about mother\n");
        message("Enter name: ");
        String name = in.nextLine();
        message("Enter surname: ");
        String surname = in.nextLine();
        message("Enter birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        message("Enter Iq: ");
        int iq = in.nextInt();
        return new Woman(name, surname, birthDate, iq);
    }

    private static Human dataAboutChild() throws ParseException {
        HumanBuilder hb = new HumanBuilder();
        Scanner in = new Scanner(System.in);
        message("Please, enter info about child ");
        message("Enter name: ");
        String name = in.nextLine();
        message("Enter surname: ");
        String surname = in.nextLine();
        message("Enter birth Date in format (dd/MM/yyyy): ");
        String birthDate = in.nextLine();
        return new Human(name, surname, birthDate);
    }

    private static int inputId(String s) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        message(s);
        try {
            return in.nextInt();
        } catch (InputMismatchException ex) {
            logger.error(ex, "Wrong Id input");
            return -1;
        }
    }

    private static String inputString(String s) {
        Scanner in = new Scanner(System.in);
        message(s);
        return in.nextLine();
    }

    private static void message(String s) {
        System.out.println(s);
    }

}
