package homeworks.homework2;

import java.util.Random;
import java.util.Scanner;

public class AreaShooting {
    public static void main(String[] args) {
        //Array parameters
        int height = 2;
        int weight = 2;

        Object[][] target = createTarget(height, weight); //Create the Array
        fillArray(0,0,"-",target); //fill the Array with "-"
        fillAxisX0(0,1, target); //fill X axis in range (0;height-1)
        fillAxisY0(0,1, target); //fill X axis in range (0;weight-1)

        System.out.println("All set. Get ready to rumble!");

        printArrayWall("|", target); //create wall between cells

        int targetX = targetAxisX(1, target.length-1); //input "X" coordinate
        int targetY = targetAxisY(1, target.length-1); //input "Y" coordinate
        while(true){
            enterX();
            int inTargetX = inputTargetX();
            if(inTargetX > target.length - 1){
                System.out.println("Try again. Input more than length");
                enterX();
                inTargetX = inputTargetX();
            } //checking input
            enterY();
            int inTargetY = inputTargetY();
            if(inTargetY > target.length - 1){
                System.out.println("Try again. Input more than length");
                enterY();
                inTargetY = inputTargetX();
            } //checking input

            if(inTargetX != targetX || inTargetY != targetY){
                missShoot(inTargetX, inTargetY, target);
                printArrayWall("|", target);
                System.out.println("Try again");
            }else {
                target[targetY][targetX] = "G";
                printArrayWall("|", target);
                System.out.println("You have won!");
                break;
            }

        }
    }

    private static Object[][] createTarget(int height, int weight){
        return new Object[height][weight];
    } //Create the Array

    private static void fillAxisX0(int firstPos, int step, Object[][] array){
        for (int i = 0; i < array.length; i++) {
            array[0][i] = firstPos -1 + step++;
        }
    } //fill X axis in range (0;height-1)

    private static void fillAxisY0(int firstPos, int step, Object[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][0] = firstPos -1 + step++;
        }
    } //fill Y axis in range (0;height-1)

    private static void fillArray(int firstAxisX, int firstAxisY, String symb, Object[][] array){

        for (int i = firstAxisX; i < array.length; i++) {
            for (int j = firstAxisY; j < array.length; j++) {
                array[i][j] = symb;
            }
        }
    } //fill the Array with "-"

    private static void printArrayWall(String wall, Object[][] array){
        for (Object[] objects : array) {
            for (int j = 0; j < array.length; j++) {
                Object num = objects[j];
                System.out.printf("%2s %s", num, wall);
            }
            System.out.println(" ");
        }
    } //create wall between cells

    private static int targetAxisX(int startX, int arrayLengthX){
        Random rnd = new Random();
        return rnd.nextInt(arrayLengthX - startX + 1) + 1;
    } //generate X coordinate of target

    private static int targetAxisY(int startY,int arrayLengthY){
        Random rnd = new Random();
        return rnd.nextInt(arrayLengthY - startY + 1) + 1;
    } //generate X coordinate of target

    private static Object[][] missShoot(int x, int y, Object[][] array){
        array[y][x] = "X";
        return array;
    } //while miss, replace cell with {X}

    private static int inputTargetX(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static int inputTargetY(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static void enterX(){
        System.out.println("Enter X coordinate: ");
    }

    private static void enterY(){
        System.out.println("Enter Y coordinate: ");
    }
}
