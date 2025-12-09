import java.util.ArrayList;
import java.util.Arrays;
public class permutations {
    
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        int n= nums.length;
        int arr[] = new int [n];
           Arrays.fill(arr, -1);
        back(nums, n, arr,ans,c);
        return ans;
    }
    private void back(int[] nums ,  int k,int arr[],  List<List<Integer>> ans,  List<Integer> c){
        if(c.size()==k){
            ans.add(new ArrayList<>(c));
            return;
        }
        for(int i=0; i<k;i++){
            if(arr[i]==-1){
                arr[i]=1;
                c.add(nums[i]);
                back(nums, k, arr, ans, c);
                c.remove(c.size()-1);
                arr[i]=-1; 
            }
        }
    }
}