class Replace {

  public static void main(String[] args) {
    String original = "eabcdef";
    String result = "";

    for (int i = 0; i < original.length(); i++) {
      if (original.charAt(i) == 'e') {
        result += "i";
      } else {
        result += original.charAt(i);
      }
    }
    System.out.println(original + " , " + result);

  }

}