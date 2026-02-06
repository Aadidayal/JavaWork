package Practice.Striver.Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;
// Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
public class secLarg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
//        int ans= heh(arr, N);
        int ans= heh2(arr,N);
        System.out.println(ans);
    }

    private static int heh2(int arr[], int n){
        if(arr.length<2) return -1;
        int max=Integer.MIN_VALUE,sec= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                sec= max;
                max=arr[i];
            }
        }
        return sec ;


    }

//    private static int heh(int arr[], int N){
//        if( arr.length<2){
//            return -1;
//        }
//        int max=Integer.MIN_VALUE,sec=Integer.MIN_VALUE;
//        for(int i=0;i<N;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        for(int i=0; i<N;i++){
//            if(arr[i]>sec && arr[i] < max){
//                sec=arr[i];
//            }
//        }
//        if(sec==Integer.MIN_VALUE) return(-1);
//        else  return(sec);
//    }

}


