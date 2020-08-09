//java一章復習

public class thought {
  public static void main(String[] args) {
    int[] nums = {40,50,60,70,80,90};

    for(int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
    for(int i = 0; i < nums.length - 1; i++) {
      System.out.println("配列を逆バブルソートします");
      for(int j = 0; j < nums.length - 1; j++) {
        if(nums[j] < nums[j+1]) {
          int num = nums[j+1];
          nums[j+1] = nums[j];
          nums[j] = num;
          System.out.println(nums[j]);
          System.out.println(nums[j+1]);
        }
      }
    }
    for(int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}