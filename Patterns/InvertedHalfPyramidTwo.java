class InvertedHalfPyramidTwo {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      // printing the spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // printing the stars
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}