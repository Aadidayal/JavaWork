package Practice.GFG;

public class PartitionswithGivenDifference {
    
}
 class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int total=0;
        int n= arr.length;
        for(int i=0; i<arr.length;i++){
            total+=arr[i];
        }    
        if(total< diff || (total-diff)%2 !=0) return 0  ;
        int target= (total-diff)/2;
        int memo[][]= new int [n][target+1];
        for(int i = 0; i < n; i++){
            Arrays.fill(memo[i],-1);
        }
        int ans= heh(n-1,target, arr, memo);
        return ans;
        
    }
    
    public int heh(int index, int target, int arr[], int memo[][]){
        if(index==0) {
            if (target == 0 && arr[0] == 0) return 2;
            if (target == 0 || target == arr[0]) return 1;
               return 0;
        }
        if(memo[index][target]!=-1) return memo[index][target];
        
        int np= heh(index-1, target, arr, memo);
        int p=0;
        if(arr[index]<=target){
            p= heh(index-1, target-arr[index], arr,memo);
        }
        memo[index][target]= p+  np;
        return memo[index][target];
    }
    
}


