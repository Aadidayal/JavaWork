import java.util.HashSet;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        
    }
      public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int i:nums) 
            set.add(i   );
            int longest = 0;
            for (int num : set) {
                if (!set.contains(num - 1)) {
                    int current = num;
                    int length = 1;
                    while (set.contains(current + 1)) {
                        current++;
                        length++;
                    }
                    longest = Math.max(longest, length);
                }
            }
            return longest;
        
    }
    
}
