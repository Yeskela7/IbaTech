package homeworks.homeworkAdditional.iterable;

import java.util.Iterator;

public class HiddenApp {
  public static void main(String[] args) {
    HiddenData data = new HiddenData();

    data.forEach(s -> System.out.println(s));

    Iterator<Integer> it2 = data.iterator_data2();
    while (it2.hasNext()) {
      System.out.println(it2.next());



    }
  }
}
