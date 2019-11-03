package homeworks.homeworkAdditional;

public class Overflow {

  static long add(long a, long b) {
    long r = a + b;
    if ((a < 0 && b < 0 && r > 0) || (a > 0 && b > 0 && r < 0))
      throw new IllegalArgumentException("Long Overflow");
    return r;
  }

  public static void main(String[] args) {
    long a = 9223372036854775774L;
    long b = 34;
    long c = add(a, b);
    long a1 = Long.MIN_VALUE;
    long b1 = -2;
    long c1 = add(a1, b1);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(a1);
    System.out.println(b1);
    System.out.println(c1);
  }
}
