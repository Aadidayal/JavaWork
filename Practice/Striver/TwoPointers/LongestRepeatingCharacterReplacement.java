package Practice.Striver.TwoPointers;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

    }

    // Tryed but didnt work cause of time limit exceeded
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxFreq = 0;
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);
                int len = j - i + 1;
                if (len - maxFreq <= k) {
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;
    }

    // Optimised one
    public int characterReplacement2(String s, int k) {
        int l = 0;
        int maxlen = 0, maxfrq = 0;
        int freq[] = new int[26];
        for (int r = 0; r < s.length(); r++) {
            freq[s.charAt(r) - 'A']++;
            maxfrq = Math.max(maxfrq, freq[s.charAt(r) - 'A']);
            while ((r - l + 1) - maxfrq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
        }
        return maxlen;
    }
}
