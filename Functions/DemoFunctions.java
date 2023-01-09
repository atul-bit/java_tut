import java.util.*;

class DemoFunctions {

  // creating functions`

  public static void printName(String name) {
    System.out.println("Name is " + name);
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name");
    String name = sc.next();

    // caling function
    printName(name);
  }

}