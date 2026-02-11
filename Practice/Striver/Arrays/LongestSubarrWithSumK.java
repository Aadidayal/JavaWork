import java.util.HashMap;

public class LongestSubarrWithSumK {
    public static void main(String[] args) {
        
    }

// keep adding elements
// check if sum == k
// update max length
//Almost GEnrated all subarray
    public int  bruteForce(int arr[], int k){
        // int len=0;
        // for(int i=0; i<arr.length;i++){
        //     int s=0;
        //     for(int j=i; j<arr.length;j++){
        //         s+=arr[j];
        //         if(s==k) len= Math.max( len, j-1+1);
        //     }
        // }
        // return len;

             HashMap <Integer, Integer>map = new HashMap<>();
        int sum=0, len=0;
        
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
            if(sum==k) len= i+1;
            if(map.containsKey( sum-k))
            len= Math.max(len, (i-map.get(sum-k)));
            if(!map.containsKey(sum))map.put(sum, i);
        }
        return len;
    }
//


}
