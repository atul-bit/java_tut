class CheckAscending{
  public static void main(String[] args){
    int[] nums = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
    boolean isAscending = true;

    for(int i = 0; i < nums.length - 1; i++){
      if(nums[i] > nums[i+1]){
        isAscending = false;
      }
    }

    if(isAscending){
      System.out.println("array is in aascending order");
    } else {
      System.out.println("array is not in aascending order");
    }
    
  }
}