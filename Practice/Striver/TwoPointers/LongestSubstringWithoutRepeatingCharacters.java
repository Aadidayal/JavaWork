package Practice.Striver.TwoPointers;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        
    }
     public int lengthOfLongestSubstring(String s) {
        int l=0,maxlen=0;
        HashMap<Character, Integer> map= new HashMap<>();
        for( int r=0;  r<s.length(); r++){
        char c= s.charAt(r);
        if(map.containsKey(c) && map.get(c)>=l){
            l= map.get(c)+1;
        }
        map.put(c,r);
        maxlen= Math.max(maxlen, r-l+1);

        }
return maxlen;
    }
}
