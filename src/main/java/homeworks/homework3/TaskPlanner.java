package homeworks.homework3;

import java.util.Scanner;

public class TaskPlanner {
    public static void main(String[] args) {
        String[][] schedule = {
                {"Sunday","Code",},
                {"Monday","fix bags"},
                {"Tuesday","look at new bags"},
                {"Wednesday","lie down"},
                {"Thursday","try not to cry"},
                {"Friday","cry a lot"},
                {"Saturday","try again"}};

        boolean input = true;
        Scanner in = new Scanner(System.in);


        while(input){
            System.out.println("\nPlease, input the day of the week:");
            String inDay = in.nextLine();
            String[] command = inDay.split(" ");
            switch (command[0].toLowerCase().trim()){
                case "sunday":
                    System.out.printf("Your tasks for %s: %s", schedule[0][0], schedule[0][1]);
                    input = true;
                    break;
                case "monday":
                    System.out.printf("Your tasks for %s: %s", schedule[1][0], schedule[1][1]);
                    input = true;
                    break;
                case "tuesday":
                    System.out.printf("Your tasks for %s: %s", schedule[2][0], schedule[2][1]);
                    input = true;
                    break;
                case "wednesday":
                    System.out.printf("Your tasks for %s: %s", schedule[3][0], schedule[3][1]);
                    input = true;
                    break;
                case "Thursday":
                    System.out.printf("Your tasks for %s: %s", schedule[4][0], schedule[4][1]);
                    input = true;
                    break;
                case "Friday":
                    System.out.printf("Your tasks for %s: %s", schedule[5][0], schedule[5][1]);
                    input = true;
                    break;
                case "Saturday":
                    System.out.printf("Your tasks for %s: %s", schedule[6][0], schedule[6][1]);
                    input = true;
                    break;
                case "exit":
                    System.out.println("Adios amigo!");
                    input = false;
                    break;
                case ("change"):
                    changeTask(schedule, command[1].toLowerCase().trim());
                    input = true;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    input = true;

            }
        }

    }

    private static void changeTask(String[][] array, String day) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            if (day.equalsIgnoreCase(array[i][0])) {
                System.out.printf("input your task for %s: ",array[i][0]);
                array[1][i] = in.nextLine();
            }
        }
    }

    private static void greetings(){
        System.out.println("Enter day of week for view schedule or 'change + day' for changing task");
    }
}
