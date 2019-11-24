package homeworks.homeworkAdditional;

public class Fractions {

    private static String fraction(int x, int y){

        int n = nod(x,y);
        if (y / n == 1) return x/n + "";
        if (x != 0 && y != 0) return x/n + "/" + y/n;
        return "0";

    }

    private static int nod(int x, int y){
        if ( y == 0) return x;
        else{
            return nod(y, x % y);}
    }

    public static void main(String[] args) {
        System.out.println(nod(0,112));
        System.out.println(fraction(1,14));
    }

}

