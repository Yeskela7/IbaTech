import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_hw1 {
    public static  void main(String[] args){

        System.out.println("Write your name");
        //enter player's name
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        //Hello
        System.out.printf("Hello, %s. Let the game begin! \nAnswer on the questions (number):\n", name);

        Random rnd =new Random();
        int random_number = rnd.nextInt(7);

        Object[][] quest =  {
                {"10 + 15","2^10","four = 4, one = 3, ten = ?","if 101 = 5, 101 * 11 == ?","33-3","e2-e?","Viente y seis"},
                {25,1024,10,1111,30,4,26}
        };

        int[] origArray = new int[1];
        int[] suppArray = new int[origArray.length];
        suppArray[0] = 0;

        Object question = quest[0][random_number];
        System.out.println(question);
        int answer = (int) quest[1][random_number];

        while(true){
            //input the number
            int your_ans = in.nextInt();

            //adding Array
            origArray[origArray.length-1] = your_ans;
            suppArray = origArray;
            origArray = new int[origArray.length+1];
            if (origArray.length - 1 >= 0) System.arraycopy(suppArray,
                    0, origArray,
                    0, origArray.length - 1);

            if(answer > your_ans){
                System.out.println("Your answer is too small. Please, try again.");
            } else if(answer < your_ans){
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.printf("Congratulations, %s!\nYour answers: ", name);
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
