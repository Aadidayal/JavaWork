package BinarySearch;

public class MountainPeek {

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,6,7,5,3,2,1};
        
    }
    static int binarySearch(int [] nw, int target ){
            int start = 0;
            int end= nw.length-1;
while (start<=end){
            int mid= start+(end - start)/2;

            if (nw[mid]> nw[mid+1]){
               // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;

            }else {
                   // you are in asc part of array
                start  = mid+1;  // because we know that mid+1 element > mid element
            }
         
        }
        return start;
    }
}
