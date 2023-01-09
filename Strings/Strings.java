class Strings {
  public static void main(String[] args) {
    String name1 = "Atul";
    String name2 = "Atul ";

    String fullName = "Hiralal Gupta";

    // Scanner sc = new Scanner(System.in);

    // to get the whole word
    // System.out.println("Enter name");
    // String name = sc.next();

    // to get the whole sentence with spaces
    // System.out.println("Enter full name");
    // String fullName = sc.nextLine();

    // System.out.println("My name is " + name + " " + fullName);

    // length of a string
    // System.out.println(name.length());

    // print each character of a string

    // for(int i = 0; i < name.length(); i++){
    // System.out.println(name.charAt(i));
    // }

    // compare strings in java

    if (name1.compareTo(name2) == 0) {
      System.out.println("strings are equal");
    } else {
      System.out.println("strings are not equal");
    }
    System.out.println(fullName.substring(0, 7));

  }
}