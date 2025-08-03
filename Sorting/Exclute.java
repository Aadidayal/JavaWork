// class Solution {
//     public double average(int[] salary) {
//         int n = salary.length;
//         if (n < 2) {
//             return 0;
//         }
//         Arrays.sort(salary);
//         int sum = 0;
//         for (int i = 1; i < n - 1; i++) {
//             sum += salary[i];
//         }
//         return (double) sum / (n - 2);
//     }
// }



// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/