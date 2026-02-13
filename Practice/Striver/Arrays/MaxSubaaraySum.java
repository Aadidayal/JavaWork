import java.util.Scanner;

public class MaxSubaaraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = maxSubArray(arr);
        System.out.println("Max Sum = " + ans);

        maxSubArray2(arr); 
    }

    // Only sum (Kadane)
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            if(sum < 0) sum = 0;
        }
        return max;
    }

    // Print subarray
    public static void maxSubArray2(int[] nums) {

        int maxi = nums[0];
        int sum = 0;

        int start = 0;
        int ansStart = 0, ansEnd = 0;

        for(int i = 0; i < nums.length; i++){

            if(sum == 0) start = i;

            sum += nums[i];

            if(sum > maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0) sum = 0;
        }

        System.out.print("The subarray is: [ ");
        for(int i = ansStart; i <= ansEnd; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
    }
}
