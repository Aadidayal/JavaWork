// package Sorting;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
// Google
public class Question2 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {

            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                }
                i++;
            }
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    ans.add(nums[index+1]);
                }

            }

            return ans;
        }

        static void swap(int arr[], int last, int start) {

            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
        }

    }
}