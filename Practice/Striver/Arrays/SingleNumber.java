import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        
    }
    class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>sh = new HashMap<>();
        for(int i: nums){
            sh.put(i, sh.getOrDefault(i,0)+1);
        }
        for(int i: sh.keySet()){
            if(sh.get(i)==1)
            return i;
        }
        return -1;
    }
}
}
