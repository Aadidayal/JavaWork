// package Sorting;

public class Question3 {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            for( i=0; i<nums.length;i++){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct );
                }else{
                    i++;
                }
            }
            
        }
            int result[]= new int[nums.length];
            for(int index=0; index<nums.length;index++){
                if(nums[index]!= index+1){
                    return nums[index];
                }
                }
                return- 1;
            }
            

      
 static  void swap(int arr[], int start,int last){
    int temp = arr[start];
    arr[start] = arr[last];
    arr[last] = temp;
        }   
    }
    
