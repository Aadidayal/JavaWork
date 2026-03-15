package Practice.Striver.TwoPointers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FruitIntoBaskit {
    public static void main(String[] args) {
        
    }
//    Time Limit Exceeded 
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int max = 0;

        for(int i = 0; i < n; i++){
            Set<Integer> set = new HashSet<>();
            int count = 0;

            for(int j = i; j < n; j++){
                set.add(fruits[j]);

                if(set.size() > 2){
                    break;
                }
                count++;
            }
            max = Math.max(max, count);
        }

        return max;
    }

    // Optimised one
        public int totalFruit2(int[] fruits) {
        int left = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                 if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }


}
