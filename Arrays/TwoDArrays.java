class TwoDArrays{
  public static void main(String[] args){
    int row = 3;
    int column = 3;
    int count = 1;

    int[][] matrix = new int[row][column];

    for(int i = 0; i < row; i++){
      for(int j = 0; j < column; j++){
        matrix[i][j] = count++;
      }
    }

    for(int i = 0; i < row; i++){
      for(int j = 0; j < column; j++){
        // matrix[i][j] = count++;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}