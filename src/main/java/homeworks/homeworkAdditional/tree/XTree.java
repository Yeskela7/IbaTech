package homeworks.homeworkAdditional.tree;

import java.util.ArrayList;

public class XTree {

  class XItem {
    int value;
    XItem left;
    XItem right;

    public XItem(int value) {
      this.value = value;
    }

    public XItem(int value, XItem left, XItem right) {
      this.value = value;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return String.format("v:%d l:%s r:%s", value,
          left == null ? "null" : "has",
          right == null ? "null" : "has");
    }
  }

  private XItem root;

    public void add(int val) {
    XItem item = new XItem(val);
    if(root == null){
      root = item;
    } else{
      XItem cur = root;
      if (item.value < cur.value && cur.left == null){
        cur.left = item;
      }else if (item.value > cur.value && cur.right == null){
        cur.right = item;
      }
    }
  }

  public boolean contains(int val) {
    throw new IllegalArgumentException("contains:not implem yet");
  }

  public void remove(int val) {
    throw new IllegalArgumentException("remove:not implem yet");
  }

}
