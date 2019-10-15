package homeworks.homework2;

public class shootingArray {
    public static void main(String[] args) {

        Object[][] target = createTarget(6, 6);
        fullArray(0,0,"-",target);
        fullAxisX0(0,1, target);
        fullAxisY0(0,1, target);
        System.out.println(target[2][2]);

        printArrayWall("|", target);

    }

    private static Object[][] createTarget(int Xsize, int Ysize){
        return new Object[Xsize][Ysize];
    }

    private static void fullAxisX0(int firstPos, int step, Object[][] array){
        for (int i = 0; i < array.length; i++) {
            array[0][i] = firstPos -1 + step++;
        }
    }

    private static void fullAxisY0(int firstPos, int step, Object[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][0] = firstPos -1 + step++;
        }
    }

    private static Object fullArray(int firstXaxis, int firstYaxix, String symb, Object[][] array){

        for (int i = firstXaxis; i < array.length; i++) {
            for (int j = firstYaxix; j < array.length; j++) {
                array[i][j] = symb;
            }
        }
        return array;
    }

    private static Object printArrayWall(String wall, Object[][] array){
        for (Object[] objects : array) {
            for (int j = 0; j < array.length; j++) {
                Object num = objects[j];
                System.out.printf("%2s %s", num, wall);
            }
            System.out.println(" ");
        }
        return array;
    }
}
