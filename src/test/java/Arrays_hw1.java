
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_hw1 {
    public static void main(String[] args) {

        System.out.println("Write your name");
        //enter player's name
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        //Hello
        System.out.printf("Hello, %s. Let the game begin! \nEnter your number:", name);
        //Random number generation
        Random rnd =new Random();
        int random_number = rnd.nextInt(100);


        //Game circle
        while (true) {
            //enter the number
            int your_num = in.nextInt();

            if (your_num < random_number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if( your_num > random_number){
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.printf("Congratulations, %s!", name);
                break;
            }
        }

    }
}
