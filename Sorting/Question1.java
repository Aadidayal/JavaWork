// package Sorting;

// https://leetcode.com/problems/missing-number/
public class Question1 {

    public int Sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] <= arr.length && arr[i] != arr[i]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index;
            }
        }
        return arr.length + 1;
    }

    static void swap(int arr[], int last, int start) {

        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;

    }

}
