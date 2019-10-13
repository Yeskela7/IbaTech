
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

        int[] origArray = new int[1];
        int[] suppArray = new int[origArray.length];
        suppArray[0] = 0;

        //Game circle
        while (true) {
            //input the number
            int your_num = in.nextInt();

            //adding Array
            origArray[origArray.length-1] = your_num;
            suppArray = origArray;
            origArray = new int[origArray.length+1];
            if (origArray.length - 1 >= 0) System.arraycopy(suppArray, 0, origArray, 0, origArray.length - 1);
            //for(int i = 0; i < origArray.length-1; i++){
            //            //    origArray[i] = suppArray[i];
            //            //}



            if (your_num < random_number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if( your_num > random_number){
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.printf("Congratulations, %s!\nYour numbers was: ", name);
                bubbleSort(suppArray);
                System.out.println(Arrays.toString(suppArray));
                break;
            }
        }

    }

    private static void bubbleSort(int[] xArr){
        for(int i = xArr.length -1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if(xArr[j] < xArr[j+1]){
                    int tmp = xArr[j];
                    xArr[j] = xArr[j+1];
                    xArr[j+1] = tmp;
                }
            }
        }
    }
}
