public class ArrangeArrayEleBySign {
    public static void main(String[] args) {
        
    }
        public int[] rearrangeArray(int[] nums) {
        int arr[]= new int [nums.length];
        int pos=0 ; 
        int neg=1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<0){
               arr[neg]=nums[i];
              neg+=2;
            }else{
              arr[pos]=nums[i];
              pos+=2;
            }
        }
     
        return arr;
    }

    // But what is They are not equally  divided?
    public static int []arrrr (int[] nums){
        int arr[] = new int [nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            
        }
    }

}
