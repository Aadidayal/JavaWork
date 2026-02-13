
import java.util.Scanner;
// only for sorted check 
public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = heh(arr, n);
        System.out.println(ans);
    }

    private static boolean heh(int arr[], int n) {
        if (arr.length == 0 || arr.length == 1)
            return true;
        for (int i = 0; i < n - 1; i++) {
            if (i < n && arr[i] > arr[i + 1]) {
                return false;
            }

        }
        return true;
    }

    // Its sorted and rotated .. leetcode 

    class Solution {
    public boolean check(int[] nums) {
        int breaks=0;
        for (int i=0; i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]) breaks++; // circular index not value
            if(breaks>1) return false;
        }
        return true;
    }
}

// why doing this? check normal array and this .. only 1 break is happning for being sorted and rotated 

// Think in a circle, not a line

// Imagine numbers on a clock 🕒

// 0 → 1 → 2 → 3 → 4 → back to 0


// That is not a normal line
// That is a cycle

// In math, cycles are handled using remainder.

// What does % (modulo) actually do?

// Modulo means:

// Stay within range [0, n-1]

// Example: n = 5

// Number	number % 5
// 0	0
// 1	1
// 2	2
// 3	3
// 4	4
// 5	0 ← wrapped
// 6	1
// 7	2

}


