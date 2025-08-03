package Recursion.Arrays;
public class RBS {
public static void main(String[] args) {
    int arr[]= {3,4,5,6,7,0,1,2};
    int ans= FindInRotatedSorted(0, 0, arr, 4);
    System.out.println(ans);
}

    static int FindInRotatedSorted(int start, int end, int arr[], int target){
        if(start>end){
            return -1;
        }
        int mid= start+ (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>= arr[start]){
            if(target<=arr[mid] && target >= arr[start]){
                return FindInRotatedSorted(start, mid-1 , arr, target);
            }else{
                return FindInRotatedSorted(mid+1, end, arr, target);
            }
        }
       
            if(target<=arr[end] && target >= arr[mid]){
                return FindInRotatedSorted(start+1, end , arr, target);
            }
            return FindInRotatedSorted(start, end+1, arr, target);
        }

    }

// 9680648522--- 