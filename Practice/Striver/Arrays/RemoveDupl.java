package Practice.Striver.Arrays;

public class RemoveDupl {
    public static void main(String[] args) {
        
    }
    // https://leetcode.com/problems/rotate-array/

     public int removeDuplicates(int[] nums) {
      int i=0;
      for (int j=1;j<nums.length;j++){
        if(nums[i]!=nums[j]) i++;
        nums[i]= nums[j];
      }
      return i+1;
    }
    
}
