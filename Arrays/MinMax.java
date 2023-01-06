import java.util.Arrays;   

class MinMax{
  public static void main(String[] args){
    int[] nums = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
    Arrays.sort(nums);
    for(int i = 0 ; i < nums.length ; i++){
      System.out.println(nums[i]);
    }
    
  }
}