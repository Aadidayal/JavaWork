package Recursion.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumSubset {
   Scanner sc = new Scanner(System.in);
   int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n;i++){
        arr[i]= sc.nextInt();
    }
        return  MaxSub(arr);

    public static int MaxSub(int arr[]){
       int dp[]= new int [arr.length];
       Arrays.fill(dp, -1);
        int ans= helper(arr, dp,0);
        return ans;
    }
    public static int helper(int arr[], int dp[], int start){
        if(start<=0) return 0;
        if(dp[start]!= -1) return dp[start];
        int include= arr[start] + helper(arr, dp, start-1);
        int exclude= 0 + helper(arr, dp, start-1);
        dp[start]= Math.max(include, exclude);
        return dp[start];
    }
}

