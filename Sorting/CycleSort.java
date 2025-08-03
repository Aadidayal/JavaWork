// package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 1, 5 };
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
        
                i++;
            }
        }
    }

    static void swap(int arr[], int last, int start) {

        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;

    }
}
