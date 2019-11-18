package homeworks.homework1;

import java.util.Arrays;

public class Sorting {
    public static void selectionSort(int[] xArr){

        for (int i = 0; i < xArr.length; i++) {
            int min = xArr[i];
            int min_i = i;
            for (int j = i +1; j < xArr.length ; j++) {
                if (xArr[j]<min) {
                    min = xArr[j];
                    min_i = j;
                }
            }
            if(i != min_i){
                int tmp = xArr[i];
                xArr[i] = xArr[min_i];
                xArr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(xArr));

    }
    //Bubble sort
    public static String bubbleSort(int[] xArr){
        for(int i = xArr.length -1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if(xArr[j] > xArr[j+1]){
                    int tmp = xArr[j];
                    xArr[j] = xArr[j+1];
                    xArr[j+1] = tmp;
                }
            }
        }
        return Arrays.toString(xArr);
    }
}
