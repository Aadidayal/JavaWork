package BinarySearch;

import java.util.Arrays;

import BeforeLinearSearch.reverseNumber;

// leetcode 888
public class FailCandy {
    public static void main(String[] args) {
        
    }
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){
        int sumA = 0, sumB= 0;

        for(int a: aliceSizes)sumA += a;
        for (int b: bobSizes) sumB += b;

        int Sum= sumA- sumB/2;
        Arrays.sort(bobSizes);

        for(int a: aliceSizes){
            int b = a-Sum;
if(binarySearch(bobSizes, b)){
    return new int []{a,b};
}
        }
        return new int []{};
    }
 static boolean  binarySearch(int nw[], int target){
    int start = 0;
    int end = nw.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (nw[mid] == target) {
            return true;
        }

        else if (nw[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        
    }

return false;
  
}
}
 

