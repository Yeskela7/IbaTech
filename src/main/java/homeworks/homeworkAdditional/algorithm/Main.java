package homeworks.homeworkAdditional.algorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(9);

        quickUnion.union(1,2);
        quickUnion.union(3, 4);
        quickUnion.union(1, 3);

        System.out.println(quickUnion.connected(2,3));
        System.out.println(Arrays.toString(quickUnion.getId()));
    }
}
