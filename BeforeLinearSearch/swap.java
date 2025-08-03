package BeforeLinearSearch;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,6,4,5};
        System.out.println(Arrays.toString(arr));
       swaaap(arr, 0, 1);
       System.out.println(Arrays.toString(arr));
    }
    static void  swaaap( int [] arr,  int index1, int index2){
int temp = arr[index1];
arr[index1]= arr[index2];
arr[index2]= temp;
    }
}
