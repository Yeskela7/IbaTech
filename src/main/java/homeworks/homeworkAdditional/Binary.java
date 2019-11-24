package homeworks.homeworkAdditional;

public class Binary {

    public static long and(long a, long b) {
        return a & b;
    }

    public static long or(long a, long b) {
        return a | b;
    }

    public static long xor(long a, long b) {
        return a ^ b;
    }

    public static long add(long a, long b) {
        long r = a + b;
        if ((a < 0 && b < 0 && r > 0) || (a > 0 && b > 0 && r < 0))
            throw new IllegalArgumentException("Long Overflow");
        return r;
    }


    public static void main(String[] args) {
        long a = 20;
        long b = 12;


        System.out.println(a);
        System.out.println(b);
        System.out.println("---------------");
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println("___________________");
        System.out.println((a & b) | (a ^ b));
        System.out.println("---------------");
        System.out.println(add(a, b));


    }

}
