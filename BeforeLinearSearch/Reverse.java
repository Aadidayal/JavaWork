package BeforeLinearSearch;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,7,8};
      System.out.println(Arrays.toString(arr));
      rever(arr);
      System.out.println(Arrays.toString(arr));
    }

    static void rever(int [] nw){
        int start= 0;
       int  end= nw.length-1;
        while(start<end){
            for(int i = start; i< end; i++){
                swap(nw, start, end);
                start ++;
                end--;
            }
        }
    
    }

static void swap( int arr[], int index1, int index2 ){
    int temp = arr[index1];
arr[index1]= arr[index2];
arr[index2]= temp;
    }
}  