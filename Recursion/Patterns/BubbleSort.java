package Recursion.Patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 1, 5, 9, 8, 7 };
        bubble(arr, arr.length -1, 0);
        // System.out.println(arr); // wronge way to Print array

        // In Java, System.out.println(arr); prints the memory address (reference) of
        // the array, not its actual contents.
        // Java does not automatically convert an array into a human-readable format
        // when printed directly.
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            // arr: The integer array that needs to be sorted.
            // r: Represents the number of passes remaining (rows).
            // c: Represents the current index being checked in the pass (columns).

            if (arr[c] > arr[c + 1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, 0);
        }
    }
}
