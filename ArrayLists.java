import java.util.*;

class ArrayLists {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    // adding element in arraylist
    list.add(1);
    list.add(2);
    list.add(3);

    // get element at particular index in aarayList
    System.out.println(list.get(0));

    // add element in between
    list.add(3, 9);

    // modify the element in list
    list.set(1, 11);

    // remove a element from an list
    list.remove(2);
    System.out.println(list);

    // looping over an arraylist

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    // sort an aarayList
    Collections.sort(list);
    System.out.println(list);

  }
}