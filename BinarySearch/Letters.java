package BinarySearch;

public class Letters {

    public static void main(String[] args) {
        char[] arr = { 'c', 'd', 'j', 'f' };
        char target = 'e'; // You need to define a target
        char ans = BinaryFind(arr, target);
        System.out.println(ans); // It should print 'd' because it is the smallest letter greater than 'c'
    }

    static char BinaryFind(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // Binary search to find the smallest letter greater than target
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the middle element is less than or equal to target, we need to search the
            // right side
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                // Otherwise, search the left side
                end = mid - 1;
            }
        }

        // If start is out of bounds, return the first element (wrap-around)
        return letters[start % letters.length];
    
    }
}
